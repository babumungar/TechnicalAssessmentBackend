package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>  {
	
}
