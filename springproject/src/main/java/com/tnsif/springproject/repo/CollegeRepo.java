package com.tnsif.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.springproject.model.College;

public interface CollegeRepo  extends JpaRepository<College,Long>{

}