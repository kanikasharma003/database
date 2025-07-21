package com.databaselearning.database.controller;

import com.databaselearning.database.dto.StudentDto;
import com.databaselearning.database.model.Student;
import com.databaselearning.database.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        logger.info("POST /students called with body: {}", student);
        return studentService.createStudent(student);
    }

    @GetMapping("/getById")
    public StudentDto getById(@RequestParam String studentId){
        logger.info("calling student service with studentId {} for student details", studentId );
       Student student = studentService.getStudentDetailById(studentId);
        return new StudentDto(student);
    }
    @GetMapping("/getAllStudent")
    public List<StudentDto> getAllStudent(){
        logger.info("calling student service with studentId  for student details");
        return studentService.getAllStudents();
    }

}
