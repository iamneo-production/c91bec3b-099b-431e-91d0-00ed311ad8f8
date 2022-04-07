package com.examly.springapp.Services;

import java.util.List;

import com.examly.springapp.Repository.HallRepository;
import com.examly.springapp.model.Hall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	HallRepository hallRepo;

	@Autowired
	HallService hallService;
    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);


	@Override
	public List<Hall> addByBookuserAndHallId(long hallId, Hall hallValues){
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String username;
			if (principal instanceof UserDetails) {
				username = ((UserDetails)principal).getUsername();
			} else {
				username = principal.toString();
			}
			hallValues.setBookuser(username);
			Hall hallDto = new Hall();
			hallDto.setBookuser(username);
			hallDto.setEventdate(hallValues.getEventdate());
			hallDto.setHallprice(hallValues.getHallprice());
			hallDto.setId(hallValues.getId());
			hallDto.setHalltype(hallValues.getHalltype());
			hallRepo.save(hallDto);
			return this.getByBookuser(username);
	}

	@Override
	public List<Hall> getByBookuser(String bookuser) {
		return hallRepo.getByBookuser(bookuser);
	}

}
