package ch.renewinkler;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentManager {

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    private void init() {
        students.add(new Student(1, "René"));
        students.add(new Student(2, "Tom"));
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}
