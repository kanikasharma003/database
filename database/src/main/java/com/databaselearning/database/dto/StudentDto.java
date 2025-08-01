package com.databaselearning.database.dto;

import com.databaselearning.database.model.Student;
import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
