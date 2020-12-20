package homework.day08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "homework.day08.dao")
public class SpringMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class,args);
    }
}
