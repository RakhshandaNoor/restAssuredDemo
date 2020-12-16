package com.example.restAssuredDemo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
    private String studentId;
    private String studentName;
    private String studentEmail;

}
