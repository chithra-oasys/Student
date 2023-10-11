package com.example.Student.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.Student;
import com.example.Student.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository StudentRepo;

	public Student agecheck(Student a)  {
	return StudentRepo.save(a);
	}
}
