package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.employee;
import com.demo.service.employeeService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Controller
public class employeeController {
 
	@Autowired
    private employeeService service	;
	
	@GetMapping("/")
	public String home(Model m) {
		List<employee> li = service.getAllEmployees();
	    m.addAttribute("li" , li);
	    for(employee emp : li ) {
	    	System.out.println(emp);
	    }
		return "index";
	}
	
	@GetMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute employee emp, HttpSession httpSession) {
		service.addEmp(emp);
		httpSession.setAttribute("msg", "Employee Successfully Added!!");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id , Model model  ) {
		employee employee = service.getEmployee(id);
		model.addAttribute("employee", employee);
		return "edit";
	}
	
	@PostMapping("/update")
    public String updateEmployee(@ModelAttribute employee e , HttpSession session) {
    	
		service.addEmp(e);
		session.setAttribute("msg", "Employee Update Successfully");
		return "redirect:/";	
    }
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id , HttpSession session ) {
		service.delete(id);
		session.setAttribute("msg", "Employee Deleted  Successfully");
		return "redirect:/";
	}
	
}
