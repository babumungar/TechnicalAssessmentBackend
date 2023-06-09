package com.stg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.model.Rating;
@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>  {

	public Rating save(Optional<Rating> ratingOb);
	
}
