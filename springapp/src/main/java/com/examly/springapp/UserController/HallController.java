package com.examly.springapp.UserController;

@RestController
@RequestMapping("user")
public class HallController {
	@Autowired
	HallService hallService;
	
	@RequestMapping("getAlllHall")
	public List<Hall> getAllHall(){
		return hallService.getAllHall();
	}
	@RequestMapping("dashboard")
	public List<Company> getAllCompany(){
		return hallService.getAllCompany();
	}
	@RequestMapping("getProductsByCategory")
	public List<Hall>ProductsByCompany(@RequestBody HashMap<String,String> request){
		String company_id = request.get("com_id");		
		return hallService.getHallByCompany(company_id);
	}
	
}