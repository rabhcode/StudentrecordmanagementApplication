package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String name);
    List<Student> findByStudentClass(String studentClass);
}
