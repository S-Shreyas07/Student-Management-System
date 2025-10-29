package com.studentManagement.StudentManagementBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentManagement.StudentManagementBackend.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
