package com.examly.springapp.SuperController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("super")
public class SuperController {
	
	@Autowired
	UserRepository userRepo;

	
	@Autowired
	CompanyRepository companyRepo;
	
	@DeleteMapping("deleteUser")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){
		
		User user = userRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("User doesnt exists with id"+id));
		userRepo.delete(user);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
	}
	@DeleteMapping("deleteAdmin")
	public ResponseEntity<HttpStatus> deleteAdmin(@PathVariable long id){
		
		Company company = companyRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Admin doesnt exists with id"+id));
		companyRepo.delete(company);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
	}

}
