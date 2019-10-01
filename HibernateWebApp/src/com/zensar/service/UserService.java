package com.zensar.service;

import java.util.List;

import com.zensar.entities.User;
import com.zensar.exceptions.UserServiceException;

/**
 * @author Gayatri Sinnarkar
 * @version 1.0
 * @creation_date 21st September 2019 5:59PM
 * @modification_date 21st september 2019 5:59PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Business Service Interface .
 * 				It is used in Business Layer.
 */

public interface UserService {
	void addUser(User user)throws UserServiceException;
	void updateUser(User user)throws UserServiceException;
	void removeUser(User user)throws UserServiceException;
	User findUserByUsername(String username)throws UserServiceException;
	List<User> findAllUsers()throws UserServiceException;
	
	boolean validateUser(User user)throws UserServiceException;
	

}
