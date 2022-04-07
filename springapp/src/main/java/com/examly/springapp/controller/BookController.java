package com.examly.springapp.controller;

import java.util.List;

import com.examly.springapp.Services.BookService;
import com.examly.springapp.model.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class BookController {

	@Autowired
	BookService bookService;

	@PutMapping("/book")
  	public ResponseEntity<List<Hall>> addBookwithHall(@RequestParam Long hallId, @RequestBody Hall hallValues){
		return ResponseEntity.ok(bookService.addByBookuserAndHallId(hallId, hallValues));
   }

   @GetMapping("/bookings")
   public ResponseEntity<List<Hall>> getByBookuser(@RequestParam String bookuser) {
	   return ResponseEntity.ok(bookService.getByBookuser(bookuser));
	}
	
}

