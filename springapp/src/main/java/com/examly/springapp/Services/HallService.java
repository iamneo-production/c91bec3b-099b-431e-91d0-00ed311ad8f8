package com.examly.springapp.Services;

import java.util.List;

import com.examly.springapp.Repository.CompanyRepository;
import com.examly.springapp.Repository.HallRepository;
import com.examly.springapp.Repository.UserRepository;
import com.examly.springapp.model.Company;
import com.examly.springapp.model.Hall;
import com.examly.springapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HallService {

	@Autowired
	HallRepository hallRepo;
	@Autowired
	CompanyRepository companyRepo;
	@Autowired
	UserRepository userRepo;

	public List<Hall> getAllHall() {
		return hallRepo.findAll();
	}

	public List<Hall> getHallByAdminId(String adminId) {

		return hallRepo.getHallByAdminId(adminId);
	}

	public List<Company> getAllCompany() {

		return companyRepo.findAll();
	}

	public Hall getHallById(long hallId) throws Exception {
		return hallRepo.findById(hallId).orElseThrow(() -> new Exception("Product is not found"));
	}


	public User getProfileById(Long id) throws Exception {
		return userRepo.findById(id).orElseThrow(() -> new Exception("profile not found"));
	}
}

