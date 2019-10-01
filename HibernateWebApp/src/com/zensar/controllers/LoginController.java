package com.zensar.controllers;
/**
 * @author Gayatri Sinnarkar
 * @version 2.0
 * @creation_date 21st September 2019 5:23PM
 * @modification_date 28st september 2019 11:52AM
 * @copyright Zensar Technologies. All rights reserved.
 * @description Java Bean class used to represent database entity.
 * 				It is also used as value object.
 * 				It is used in all layers of application.
 *
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exceptions.UserServiceException;
import com.zensar.service.UserService;
import com.zensar.service.UserServiceImpl;


/**
 * Servlet implementation class LoginController
 */
@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl();
		((UserServiceImpl) userService).setUserDao(userDao);
		setUserService(userService);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User clientUser = new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		PrintWriter out = response.getWriter();
		//invoking business logic of business layer in presentation layer
		try {
			if(userService.validateUser(clientUser))
			{
				//out.println("<p>Dear "+username+" Welcome to online shopping</p>");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.println("<p>Sorry! Invalid username or password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (UserServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
