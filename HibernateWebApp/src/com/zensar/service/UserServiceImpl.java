package com.zensar.service;
/**
 * @author gayatri Sinnarkar
 * @version 2.0
 * @creation_date 21st September 2019 5:29PM
 * @modification_date 28st september 2019 11:48am
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface.
 *				It is used in persistance layer of application.
 */
import java.util.List;
import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exceptions.UserServiceException;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) throws UserServiceException {
		userDao.insert(user);

	}

	@Override
	public void updateUser(User user) throws UserServiceException {
		// TODO Auto-generated method stub
		
		userDao.update(user);

	}

	@Override
	public void removeUser(User user) throws UserServiceException {
		userDao.delete(user);
	}

	@Override
	public User findUserByUsername(String username) throws UserServiceException {
		// TODO Auto-generated method stub
		
		User user= userDao.getbyUsername(username);
		return user;
		
	}

	@Override
	public List<User> findAllUsers() throws UserServiceException {
		// TODO Auto-generated method stub
		
		return userDao.getAll();
		
	}

	@Override
	public boolean validateUser(User user) throws UserServiceException {
		// TODO Auto-generated method stub
		
		User dbUser = findUserByUsername(user.getUsername());
		if(dbUser!=null && dbUser.getPassword().equals(user.getPassword()))
				return true;
		else
		return false;
	}

}
