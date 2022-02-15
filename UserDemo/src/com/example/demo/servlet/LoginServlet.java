package com.example.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;

public class LoginServlet extends HttpServlet  {
	
	UserDao userdao= new UserDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("Hello world");
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		User user= userdao.getUserByUsernameAndPassword(username, password);
				
		
		if(user!= null) {
			
			List<User> users= userdao.findAll();
			request.setAttribute("userList", users);
			
			request.getRequestDispatcher("Pages/dashboard.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("Pages/page1.jsp");
		}
		
	}
	


}
