package com.example.restAssuredDemo.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    @GetMapping("/students/{studentId}")
    public ResponseEntity<?> getStudentById(@PathVariable String studentId){
        Student s = new Student();
        s.setStudentId("123");
        s.setStudentEmail("john@gmail.com");
        s.setStudentName("John Doe");
        return ResponseEntity.ok(s);
    }
}
