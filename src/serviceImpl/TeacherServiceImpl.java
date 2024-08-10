package serviceImpl;

import entity.Teacher;
import service.CommonService;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements CommonService<Teacher> {

    static List<Teacher> teacherList = new ArrayList<Teacher>();

    static {
        teacherList.add(new Teacher("Kenan Memmedov", 70, 1, 3000, "Kimya"));
    }

    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public Teacher getById(int id) {
        return null;
    }

    @Override
    public void add(Teacher object) {

    }

    @Override
    public void delete(int id) {

    }
}
