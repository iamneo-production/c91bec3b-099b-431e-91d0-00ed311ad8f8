package com.examly.springapp.Services;


import com.examly.springapp.model.User;
import com.examly.springapp.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
