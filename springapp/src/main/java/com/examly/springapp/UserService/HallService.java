package com.examly.springapp.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HallService {

	@Autowired
	HallRepository hallRepo;
	@Autowired
	CompanyRepository companyRepo;
	@Autowired
	BookRepository bookRepo;
	
	public List<Hall>getAllHall(){
		return hallRepo.findAll();
	}
	
	public List<Company>getAllCompany(){
		return companyRepo.findAll();
	}

	public Hall getHallById(long company_id) {
		return hallRepo.getById(company_id);
	}

	public Hall getHallDetailsById(long id) {
		return hallRepo.getById(id);
	}

	public Book createBook(Book book) {
		return bookRepo.save(book);
	}

	public Book getBookById(long user_id) {
		return bookRepo.getById(user_id);
	}
	
}
