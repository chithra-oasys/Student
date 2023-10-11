package com.example.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.Student;
import com.example.Student.Exception.AgeNotFoundException;
import com.example.Student.Service.StudentServices;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentServices studentSer;

	@PostMapping(value = "/age")
	public Student agecheck(@RequestBody Student s) throws AgeNotFoundException {
		return studentSer.agecheck(s);
	}
}
