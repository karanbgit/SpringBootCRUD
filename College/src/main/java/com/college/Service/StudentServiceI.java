package com.college.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.college.Model.Student;

@Service
public interface StudentServiceI 
{
	public void addStudentData(Student student);
	
	public List<Student> showStudentData();
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int id);
	
}
