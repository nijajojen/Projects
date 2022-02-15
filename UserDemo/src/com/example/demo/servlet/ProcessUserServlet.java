package com.example.demo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;

public class ProcessUserServlet extends HttpServlet  {

	UserDao userdao= new UserDao();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	try {	
		SimpleDateFormat simpleFormat= new SimpleDateFormat("mm/dd/yyyy");
		
		String name= req.getParameter("name");
		String phone= req.getParameter("phone");
		Date date= simpleFormat.parse(req.getParameter("dob"));
		String username= req.getParameter("username");
		String password= req.getParameter("password");
		
		
		User user=new User();
		user.setName(name);
		user.setPhoneNo(phone);
		user.setDob(date);
		user.setUsername(username);
		user.setPassword(password);
		
		userdao.save(user);
		
	}
	catch(Exception e) {
		
	}
	}

}
