package com.swagger.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@GetMapping("/getone")
	public String getStudent() {
		return "get one student.....";
	}
	
	@PostMapping("/saveone")
	public String saveStudent() {
		return "save one student.....";
	}
	
	@GetMapping("/getall")
	public String getAllStudent() {
		return "get all student.....";
	}
	
	@PutMapping("/updateone")
	public String updateStudent() {
		return "update one student.....";
	}
	@DeleteMapping("/deleteone")
	public String deleteStudent() {
		return "delete one student.....";
	}
}
