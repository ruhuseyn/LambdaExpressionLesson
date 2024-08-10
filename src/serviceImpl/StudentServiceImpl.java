package serviceImpl;

import entity.Student;
import service.CommonService;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements CommonService<Student>, StudentService {

    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Fexri Hesenzade", 26, 1, "InfoSec", "fexri@gamil.com", 88));
        studentList.add(new Student("Elvin Yusubov", 30, 2, "InfoSec", "memmedov@gamil.az", 72));
        studentList.add(new Student("Benovse Aydinli", 19, 3, "CompSc", "benovse@gamil.ru", 95));
        studentList.add(new Student("Merdan Memmedov", 23, 4, "Managament", "merdan@gamil.com", 61));

    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void add(Student object) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Student> getAllStudentByGpa(Integer gpa) {
        return studentList.stream().filter(student -> student.getGpa()>gpa).toList();
    }

    @Override
    public List<Student> getAllStudentsByEmail(String domain) {
        return studentList.stream().filter(student -> student.getEmail().contains(domain)).toList();
    }

    @Override
    public List<Student> getAllStudentByNameLength(Integer length) {
        return studentList.stream().filter(alma-> alma.getFullName().length()>length).toList();
    }

    @Override
    public Student getById(Integer id) {
        return studentList.stream().filter(student -> student.getId() == id).toList().get(0);
    }

    @Override
    public Student getByNameAndGpa(String name, Integer gpa) {
        return studentList.stream()
                .filter(student -> student.getFullName().equals(name) && student.getGpa().equals(gpa)).toList().get(0);
    }
}
