package com.examly.springapp.UserController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("user")
public class HallController {
	@Autowired
	HallService hallService;
	
	@RequestMapping("getAllHall")
	public List<Hall> getAllHall(){
		return hallService.getAllHall();
	}
	@RequestMapping("dashboard")
	public List<Company> getAllCompany(){
		return hallService.getAllCompany();
	}
	@RequestMapping("halls")
	@ResponseBody
	public Hall getHallById(@RequestParam long company_id){
		return hallService.getHallById(company_id);
	}
	@RequestMapping("hallDetails")
	@ResponseBody
	public Hall getHallDetailsById(@RequestParam long id) {
		return hallService.getHallDetailsById(id);
	}
	@PostMapping("book")
	public Book createBook(@RequestBody Book book) {
		return hallService.createBook(book);
	}
	@RequestMapping("bookings")
	@ResponseBody
	public Book getBookById(@RequestParam long user_id) {
		return hallService.getBookById(user_id);
	}
	
}