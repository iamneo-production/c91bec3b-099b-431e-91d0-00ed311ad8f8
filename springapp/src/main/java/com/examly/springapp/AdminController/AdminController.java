package com.examly.springapp.AdminController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
    HallRepository hallRepo;
	
	@Autowired
	CompanyRepository companyRepo;
	
	
	
	@GetMapping("dashboard")
	public Hall getHallByCompanyId(@RequestParam long company_id){
		return hallRepo.getById(company_id);
	}
	
	@PostMapping("addHall")
	public Hall createhall(@RequestBody Hall hall ) {
		return hallRepo.save(hall);
	}

	@PutMapping("editHall")
	public ResponseEntity<Hall> updateHall(@PathVariable long id, @RequestBody Hall hall){
		Hall updateHall = hallRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Hall doesnt exixts with id"+id));
		
		updateHall.setHallname(hall.getHallname());
		updateHall.setPrice(hall.getPrice());
		updateHall.setEventdate(hall.getEventdate());
		updateHall.setHalltype(hall.getHalltype());
		
		hallRepo.save(updateHall);
		
		return ResponseEntity.ok(updateHall);
				
	}
	@DeleteMapping("deleteHall")
	public ResponseEntity<HttpStatus> deleteHall(@PathVariable long id){
		
		Hall hall = hallRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Hall doesnt exists with id"+id));
		
		hallRepo.delete(hall);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
	}
	@RequestMapping("profile")
	public Company getProfileById(@PathVariable long id) {
		return companyRepo.getById(id);
	}
	@PutMapping("editProfile")
	public ResponseEntity<Company> editProfile(@PathVariable long id, @RequestBody Company company){
		Company editProfile = companyRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Profile doesnt exists with id"+id));
		
		editProfile.setCompanyname(company.getCompanyname());
		editProfile.setCompanyaddress(company.getCompanyaddress());
		editProfile.setMobilenumber(company.getMobilenumber());
		editProfile.setCompanyemailid(company.getCompanyemailid());
		
		companyRepo.save(editProfile);
		
		return ResponseEntity.ok(editProfile);
				
	}
	 

	

}



