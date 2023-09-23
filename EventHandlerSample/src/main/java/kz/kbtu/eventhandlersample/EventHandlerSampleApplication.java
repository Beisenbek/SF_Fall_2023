package kz.kbtu.eventhandlersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventHandlerSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventHandlerSampleApplication.class, args);
    }

}
