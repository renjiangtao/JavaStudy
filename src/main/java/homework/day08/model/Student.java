package homework.day08.model;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int id;
    private String name;
    private String sex;
    private Date create_time;
}
