package homework.day08.service.impl;

import homework.day08.dao.StudentDao;
import homework.day08.model.Student;
import homework.day08.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class StudentServiceImpl implements StudentService {

    public static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Resource
    StudentDao studentDao;

    @Override
    public Student getStudentById(int id) {
        log.info("传入的id是{}",id);
        Student student = studentDao.getStudentById(id);
        return student;
    }
}
