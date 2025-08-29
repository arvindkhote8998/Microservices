package com.rating.service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.service.entity.Ratings;

public interface RatingRepository extends JpaRepository<Ratings, Integer> {

	public Optional<Ratings> findByUserId(Integer userId);

	public Optional<List<Ratings>> findByHotelId(Integer hotelId);
}
