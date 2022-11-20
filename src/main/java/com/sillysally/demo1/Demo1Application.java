package com.sillysally.demo1;

import com.sillysally.demo1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

 /* @GetMapping
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/goodbye")
    public List<String> goodBye(){
        return List.of("Good", "Bye");
    }*/



}
