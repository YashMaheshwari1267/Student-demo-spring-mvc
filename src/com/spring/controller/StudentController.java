package com.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;
import com.spring.service.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceImpl studentServiceImpl;

	@GetMapping("/list")
	public String homeHandler(Model model) {
		List<Student> list = studentServiceImpl.searchAll();
		model.addAttribute("list", list);
		model.addAttribute("student", new Student());
		return "index";
	}

	@PostMapping("/submitForm")
	public String submitFormHandler(@ModelAttribute("student") Student student, Model model) {
		studentServiceImpl.insertStudent(student);
		model.addAttribute("student", student);
		return "redirect:/student/list";
	}

	@GetMapping("/delete")
	public String deleteHandler(@RequestParam("id") String id) {
		int studId = Integer.parseInt(id);
		studentServiceImpl.deleteStudent(studId);
		return "redirect:/student/list";
	}

	@GetMapping("/updateForm")
	public String updateFormHandler(@RequestParam("id") String id, Model model) {
		int studId = Integer.parseInt(id);
		Student s = studentServiceImpl.searchStudent(studId);
		model.addAttribute("student", s);
		return "edit-form";
	}

	@PostMapping("/update")
	public String updateHandler(@ModelAttribute("student") Student student, Model model) {
		studentServiceImpl.updateStudent(student);
		model.addAttribute("student", student);
		return "redirect:/student/list";
	}

	@GetMapping("/sorting")
	public String sortHandler(@RequestParam("sortBy") String sortBy, Model model) {
		List<Student> list = studentServiceImpl.sortList(sortBy);
		model.addAttribute("list", list);
		model.addAttribute("student", new Student());
		return "index";
	}

}
