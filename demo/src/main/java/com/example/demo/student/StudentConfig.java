package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student John = new Student ("John", "John@Doe.com",
                    LocalDate.of(1993, 4, 10));

            Student Jane = new Student("Jane", "Jane@Doe.com",
                    LocalDate.of(1992, 2, 20));

            repository.saveAll(List.of(John, Jane));
        };
    }
}


