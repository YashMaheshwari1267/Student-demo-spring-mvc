package com.spring.mvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.Student;
import com.spring.mvc.service.StudentServiceImpl;

@Controller
public class StudentController {

	@RequestMapping(value="/app",method=RequestMethod.GET)
	public String homeHandler(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping(value="/submitForm", method = RequestMethod.GET)
	public String formHandler(@ModelAttribute("student") Student student) {
		StudentServiceImpl service= new StudentServiceImpl();
		service.insertStudent(student);
		return "redirect index";
	}

}
