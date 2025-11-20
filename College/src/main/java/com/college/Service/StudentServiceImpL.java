package com.college.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.Doe.StudentDoe;
import com.college.Model.Student;

@Service
public class StudentServiceImpL implements StudentServiceI 
{

	@Autowired
	
	private StudentDoe d;
	
	
	@Override
	public void addStudentData(Student student)
	{
		d.save(student);
	}

	@Override
	public List<Student> showStudentData()
	{
		List<Student> list = d.findAll();
		return list;
	}
	
	
	@Override
	public Student updateStudent(Student student)
	{
		Student add = d.save(student);
		return add;
	}
	
	
	@Override
	public void deleteStudent(int id)
	{
		d.deleteById(id);
	}
}















