package com.user.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {

	private Integer ratingId;
	private Integer userId;
	private Integer hotelId;
}
