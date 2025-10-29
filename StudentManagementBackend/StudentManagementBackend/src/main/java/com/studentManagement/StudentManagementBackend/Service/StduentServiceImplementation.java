package com.studentManagement.StudentManagementBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.StudentManagementBackend.Repository.StudentRepository;
import com.studentManagement.StudentManagementBackend.model.Student;

@Service
public class StduentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository studentRepository; 
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}
