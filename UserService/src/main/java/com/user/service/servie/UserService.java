package com.user.service.servie;

import java.util.List;

import com.user.service.dto.UserDTO;
import com.user.service.entiy.User;

public interface UserService {

	public User create(UserDTO userDTO);
	
	public User getUser(Integer userId);
	
	public void deleteUser(Integer userId);
	
	public List<User> getAllUser();
}
