package com.hotel.service.service;

import java.util.List;

import com.hotel.service.entity.Hotel;
import com.hotel.service.mapping.HotelDTO;

public interface HotelService {

	public Hotel createHotel(HotelDTO hotelDTO);
	
	public List<Hotel> getAllHotels();
	
	public Hotel getHotelById(Integer hotelId);
}
