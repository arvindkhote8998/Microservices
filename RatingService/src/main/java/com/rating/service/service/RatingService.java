package com.rating.service.service;

import java.util.List;

import com.rating.service.entity.Ratings;
import com.rating.service.mapping.RatingDTO;

public interface RatingService {

	public Ratings create(RatingDTO ratingDTO);
	
	public List<Ratings> getAllratings();
	
	public Ratings findRatings(Integer ratingsId);
	
	public Ratings findByUserId(Integer userId);
	
	public List<Ratings> findByHotelId(Integer hotelId);
}
