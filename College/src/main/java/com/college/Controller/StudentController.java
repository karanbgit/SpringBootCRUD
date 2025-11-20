package com.college.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.college.Doe.StudentDoe;
import com.college.Model.Student;
import com.college.Service.StudentServiceI;

@RestController
@RequestMapping
public class StudentController 
{

	@Autowired
	
	private StudentServiceI s;
	
	
	@PostMapping("/add")
	public String addStudentData(@RequestBody Student student)
	{
		s.addStudentData(student);
		return "Data add success...";
	}
	
	@GetMapping("/findStd")
	public List<Student> show()
	{
		List<Student> list = s.showStudentData();
		return list;
	}
	
	
	@PostMapping("/updateStd/{id}")

	public String update(@PathVariable Long id, @RequestBody Student student)
	{
		student.setId(id);
		
		Student update = s.updateStudent(student);
		return "Update data success..";
	}
	
	@DeleteMapping("/deleteStd/{id}")
	
	public String delete(@PathVariable int id)
	{
		s.deleteStudent(id);
		return "Data delete success..";
	}
}












