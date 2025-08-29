package com.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.entiy.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
