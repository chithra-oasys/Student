package com.example.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Dao.StudentDao;
import com.example.Student.Entity.Student;
import com.example.Student.Exception.AgeNotFoundException;

@Service
public class StudentServices {
@Autowired
StudentDao StuDao;
public Student agecheck(Student s)throws AgeNotFoundException {
	if(s.getAge()>=18) {
		return StuDao.agecheck(s);
	}
	else {
		throw new AgeNotFoundException("not eligible");
	}
}
}