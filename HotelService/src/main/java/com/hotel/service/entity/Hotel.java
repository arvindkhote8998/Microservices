package com.hotel.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	private String hotelName;
	private String feedBack;
	private String location;
}
