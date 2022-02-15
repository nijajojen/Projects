package com.project.assignment.EmployeeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.assignment.EmployeeProject.entity.Component;

import dao.CompDao;
import service.SaveCompService;
@Controller
public class DetailController {
	
	/*@RequestMapping(value="/employeeDetails")
	public String goToDetailPage() {
		
		return "employeeDetails.jsp";
		
		}*/
	@RequestMapping(value="/earningEntry")
	public String goToEarningEntries() {
		return "earningsEntry";
		
	}
	
	
	@RequestMapping(value="/saveComponent",method= RequestMethod.POST)
	public void saveComponentMaster(@RequestParam("inputComName") String cName, @RequestParam("selectList") String cType, @RequestParam("inputComAmt") int cAmt ) {
		
		SaveCompService savecompService= new SaveCompService();
		savecompService.cTypeCheck(cName, cType, cAmt);
		
	}
	
	
	

}
