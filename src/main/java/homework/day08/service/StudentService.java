package homework.day08.service;

import homework.day08.model.Student;
import org.springframework.stereotype.Component;

public interface StudentService {

    public Student getStudentById(int id);
}
