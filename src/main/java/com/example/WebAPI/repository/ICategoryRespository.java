package com.example.WebAPI.repository;

import com.example.WebAPI.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRespository extends JpaRepository<Category,Long> {

}

