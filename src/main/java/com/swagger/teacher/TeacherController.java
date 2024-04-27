package com.swagger.teacher;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
@RequestMapping("/api/v2/Teacher")
public class TeacherController {

	@GetMapping("/getone")
	public String getTeacher() {
		return "get one Teacher.....";
	}
	
	@PostMapping("/saveone")
	public String saveTeacher() {
		return "save one Teacher.....";
	}
	
	@GetMapping("/getall")
	public String getAllTeacher() {
		return "get all Teacher.....";
	}
	
	@PutMapping("/updateone")
	public String updateTeacher() {
		return "update one Teacher.....";
	}
	
	@Hidden
	@DeleteMapping("/deleteone")
	public String deleteTeacher() {
		return "delete one Teacher.....";
	}
}
