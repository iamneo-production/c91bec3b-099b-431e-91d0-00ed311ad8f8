package com.examly.springapp.Services;


import java.util.List;

import com.examly.springapp.model.Hall;
import org.springframework.stereotype.Service;



@Service
public interface BookService {

	List<Hall> addByBookuserAndHallId(long hallId, Hall hallValues);


	List<Hall> getByBookuser(String bookuser);
}