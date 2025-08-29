package com.hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.service.entity.Hotel;
import com.hotel.service.mapping.HotelDTO;
import com.hotel.service.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody HotelDTO hotelDTO){
		Hotel hotel = hotelService.createHotel(hotelDTO);
		return new ResponseEntity<Hotel>(hotel, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllHotels")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> hotels = hotelService.getAllHotels();
		return new ResponseEntity<List<Hotel>>(hotels, HttpStatus.OK);
	}
	
	@GetMapping("/getHotelById/{hoteId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("hoteId") Integer hoteId ) {
		Hotel hotelById = hotelService.getHotelById(hoteId);
		return new ResponseEntity<Hotel>(hotelById, HttpStatus.OK);
	}
}
