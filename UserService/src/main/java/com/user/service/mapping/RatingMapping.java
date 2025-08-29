package com.user.service.mapping;

import com.user.service.dto.RatingDTO;
import com.user.service.dto.Ratings;

public class RatingMapping {

	public static RatingDTO toDTO(Ratings ratings) {
		RatingDTO ratingDTO = new RatingDTO();
		ratingDTO.setHotelId(ratings.getHotelId());
		ratingDTO.setUserId(ratings.getUserId());
		return ratingDTO;
	}
}
