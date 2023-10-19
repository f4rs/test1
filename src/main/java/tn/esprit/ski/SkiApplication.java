package tn.esprit.ski;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Aspect
@SpringBootApplication
@Slf4j
public class SkiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiApplication.class, args);

    }

}
