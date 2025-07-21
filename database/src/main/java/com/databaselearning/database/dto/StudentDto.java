package com.databaselearning.database.dto;

import com.databaselearning.database.model.Student;
import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private String email;

    public StudentDto(Student student) {
        this.name = student.getName();
        this.email = student.getEmail();
    }
}
