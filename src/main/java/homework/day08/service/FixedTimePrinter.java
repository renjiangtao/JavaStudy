package homework.day08.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FixedTimePrinter {

    private static final Logger log = LoggerFactory.getLogger(FixedTimePrinter.class);

    @Scheduled(cron = "10 * * * * ?")
    public void printTime(){
        log.info("当前时间是{}",LocalDateTime.now());
    }
}
