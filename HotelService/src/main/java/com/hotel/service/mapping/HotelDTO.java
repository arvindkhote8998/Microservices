package com.hotel.service.mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HotelDTO {

	private Integer hotelId;
	private String hotelName;
	private String feedBack;
	private String location;
}
