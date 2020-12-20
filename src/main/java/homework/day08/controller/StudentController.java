package homework.day08.controller;

import homework.day08.model.Student;
import homework.day08.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@ResponseBody
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Resource
    StudentService studentService;

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        log.info("学生id是{}",id);
        Student student = studentService.getStudentById(id);
        return student;
    }
}
