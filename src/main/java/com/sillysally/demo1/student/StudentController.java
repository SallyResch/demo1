package com.sillysally.demo1.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping()
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Sally",
                        "sallyresch27@gmail.com",
                        35,
                        LocalDate.of(1987, Month.FEBRUARY,10) )
        );
    }
}
