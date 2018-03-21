package com.springmvc.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
	public class EmpController {  
	  
	    @RequestMapping("/empform")  
	    public ModelAndView showform(){  
	         //command is a reserved request attribute name, now use <form> tag to show object data  
	        return new ModelAndView("empform","command",new Emp());  
	    }  
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
	        //write code to save emp object  
	        //here, we are displaying emp object to prove emp has data  
	        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());  
	          
	        //return new ModelAndView("empform","command",emp);//will display object data  
	        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    }  
	      
	    @RequestMapping("/viewemp")  
	    public ModelAndView viewemp(){  
	        //write the code to get all employees from DAO  
	        //here, we are writing manual code of list for easy understanding  
	        List<Emp> list=new ArrayList<Emp>();  
	        list.add(new Emp(101,"priya",35000));  
	        list.add(new Emp(102,"suren",20000));  
	        list.add(new Emp(103,"priya2",15000));  
	          
	        return new ModelAndView("viewemp","list",list);  
	    }  
	}  

