package com.studentManagement.StudentManagementBackend.Service;

import java.util.List;

import com.studentManagement.StudentManagementBackend.model.Student;

public interface StudentService {

	//Create
	public void addStudent(Student student);

	//Read
	public Student getStudentById(int id);
	public List<Student> getAllStudents();

	//Update
	public void updateStudent(Student student);
	
	//Delete
	public void deleteStudentById(int id);
	
}
