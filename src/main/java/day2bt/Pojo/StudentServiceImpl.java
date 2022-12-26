package day2bt.Pojo;

import java.util.HashMap;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private Map<Long,Student> studentMap = new HashMap<>();{

    }

    @Override
    public void insert(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void update(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public Student find(long studentID) {
        return studentMap.get(studentID);
    }
}
