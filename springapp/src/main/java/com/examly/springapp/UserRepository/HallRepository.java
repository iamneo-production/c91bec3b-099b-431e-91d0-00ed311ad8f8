package com.examly.springapp.UserRepository;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long> {
	@Query("Select hal FROM Hall hal WHERE hal.company_id=:com_id")
	List<Hall> getByCompanyId(@Param("com_id")String com_id);
	

}
