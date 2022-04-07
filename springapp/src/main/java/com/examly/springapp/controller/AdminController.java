package com.examly.springapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.examly.springapp.Exception.ResourceNotFoundException;
import com.examly.springapp.Repository.CompanyRepository;
import com.examly.springapp.Repository.HallRepository;
import com.examly.springapp.Repository.UserRepository;
import com.examly.springapp.Services.HallService;
import com.examly.springapp.model.Company;
import com.examly.springapp.model.Hall;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
@ResponseBody
public class AdminController {

    @Autowired
    HallRepository hallRepo;

    @Autowired
    CompanyRepository companyRepo;

    @Autowired
    UserRepository userRepo;

    @Autowired
    HallService hallService;

    @PostMapping("/addCompany")
    public Company createCompany(@RequestBody Company company){

        return companyRepo.save(company);
    }

    @GetMapping("/getCompanyByUserId")
    public Optional<Company> getCompanyByUserId(@RequestParam Long userId){

        return companyRepo.findById(userId);
    }

    @GetMapping ("/dashboard")
    public List<Hall> getHallByCompany(@RequestParam HashMap<String, String> request) {
        String companyId = request.get("com_id");
        return hallService.getHallByCompany(companyId);
    }

    @PostMapping("/addHall")
    public Hall createhall(@RequestBody Hall hall) {
        return hallRepo.save(hall);
    }

    @PutMapping("/editHall")
    public ResponseEntity<Hall> updateHall(@RequestParam long id, @RequestBody Hall hall) {
        Hall updateHall = hallRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hall doesnt exixts with id" + id));

        updateHall.setEventdate(hall.getEventdate());
        updateHall.setDescription(hall.getDescription());
        updateHall.setHalltype(hall.getHalltype());
        updateHall.setHallprice(hall.getHallprice());
        hallRepo.save(updateHall);

        return ResponseEntity.ok(updateHall);

    }

    @DeleteMapping("/deleteHall")
    public ResponseEntity<HttpStatus> deleteHall(@RequestParam long id) {

        Hall hall = hallRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hall doesnt exists with id" + id));

        hallRepo.delete(hall);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/profile")
    public Optional<User> getProfileById(@RequestParam long id) {

        return userRepo.findById(id);
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
    @GetMapping("/companyProfile")
    public Optional<Company> getCompanyProfileById(@RequestParam long id) {

        return companyRepo.findById(id);
    }


    @PutMapping("/editCompanyProfile")
    public ResponseEntity<Company> editProfile(@RequestParam long id, @RequestBody Company company) {
        Company editProfile = companyRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Profile doesnt exists with id" + id));

        editProfile.setCompanyname(company.getCompanyname());
        editProfile.setCompanyaddress(company.getCompanyaddress());
        editProfile.setMobilenumber(company.getMobilenumber());

        companyRepo.save(editProfile);

        return ResponseEntity.ok(editProfile);

    }

}

