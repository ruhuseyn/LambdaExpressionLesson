package service;

import entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudentByGpa(Integer gpa);

    List<Student> getAllStudentsByEmail(String domain);

    List<Student> getAllStudentByNameLength(Integer length);

    Student getById(Integer id);

    Student getByNameAndGpa(String name, Integer gpa);
}
