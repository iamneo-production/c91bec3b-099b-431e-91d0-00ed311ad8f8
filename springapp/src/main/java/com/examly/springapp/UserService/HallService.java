package com.examly.springapp.UserService;

@Service
public class HallService {

	@Autowired
	HallRepository hallRepo;
	@Autowired
	CompanyRepository companyRepo;
	
	public List<Hall>getAllHall(){
		return hallRepo.findAll();
	}
	public List<Hall>getHallByCompany(String hall_id){
		return hallRepo.getByCompanyId(hall_id);
		
	}
	public List<Company>getAllCompany(){
		return companyRepo.findAll();
	}
	
	public Hall getHallById(long hall_Id) throws Exception {
		return hallRepo.findById(hall_Id).orElseThrow(() ->new Exception("Hall is not found"));
	}
	
}
