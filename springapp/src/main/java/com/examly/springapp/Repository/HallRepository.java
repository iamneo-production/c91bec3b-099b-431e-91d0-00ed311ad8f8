package com.examly.springapp.Repository;

import java.util.List;

import com.examly.springapp.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
	List<Hall> getHallByAdminId(String adminId);

	List<Hall> getByBookuser(String bookuser);

}

