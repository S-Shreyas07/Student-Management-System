package com.studentManagement.StudentManagementBackend.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.studentManagement.StudentManagementBackend.Service.StduentServiceImplementation;
import com.studentManagement.StudentManagementBackend.model.Student;

@RestController
public class Controller {
	
	@Autowired
	StduentServiceImplementation service;
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@GetMapping("/student/all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/student/new")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}
	
	@PostMapping("/student/update")
	public void updateStudent(@RequestBody Student student) {
		service.updateStudent(student);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudentById(@PathVariable int id) {
		service.deleteStudentById(id);
	}
}
