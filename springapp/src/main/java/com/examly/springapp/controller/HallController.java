package com.examly.springapp.controller;

import java.util.HashMap;
import java.util.List;

import com.examly.springapp.Exception.ResourceNotFoundException;
import com.examly.springapp.Repository.UserRepository;
import com.examly.springapp.Services.HallService;
import com.examly.springapp.model.Company;
import com.examly.springapp.model.Hall;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class HallController {
	@Autowired
	HallService hallService;

	@Autowired
	UserRepository userRepo;
	

	@GetMapping("/getAllHall")
	public List<Hall> getAllHall() {
		return hallService.getAllHall();
	}

	@GetMapping("/dashboard")
	public List<Company> getAllCompany() {
		return hallService.getAllCompany();
	}

	@GetMapping("/halls")
	public List<Hall> getByAdminId(@RequestParam  String adminId) {
		return hallService.getHallByAdminId(adminId);
	}


	@GetMapping("/hallDetails")
	public Hall getHallById(@RequestParam Long id) throws Exception {
		return hallService.getHallById(id);
	}

	@GetMapping("/profile")
	public User getProfileById(@RequestParam Long id) throws Exception {
		return hallService.getProfileById(id);
	}

	@PutMapping("/editProfile")
	public ResponseEntity<User> editProfile(@RequestParam long id, @RequestBody User user) {
		User editProfile = userRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Profile doesnt exists with id" + id));

		editProfile.setFirstName(user.getFirstName());
		editProfile.setLastName(user.getLastName());
		editProfile.setEmail(user.getEmail());

		userRepo.save(editProfile);

		return ResponseEntity.ok(editProfile);

	}
}
