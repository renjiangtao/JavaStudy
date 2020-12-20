package homework.day08.dao;

import homework.day08.model.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {

    public Student getStudentById(@Param("id") int id);
}
