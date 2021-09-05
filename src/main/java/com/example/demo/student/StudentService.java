package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "archer", 21, LocalDate.of(2017, Month.JULY, 5), "archer@gmail.com")
        );
    }
}
