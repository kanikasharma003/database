package com.databaselearning.database.service;

import com.databaselearning.database.controller.StudentController;
import com.databaselearning.database.dto.StudentDto;
import com.databaselearning.database.mapper.StudentMapper;
import com.databaselearning.database.model.Student;
import com.databaselearning.database.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public Student createStudent(Student student) {

        logger.info("Creating student: {}", student.getName());
        studentRepository.save(student);
        logger.info("Created student: {}", student.getName());
        return student;
    }

    public Student getStudentDetailById(String studentId) {

        logger.info("fetching student ById: {}", studentId);
       Student student= studentRepository.getReferenceById(Long.valueOf(studentId));
        logger.info("fetched student ById: {} student details {} ", studentId , student);
        return student;
    }

    public List<StudentDto> getAllStudents() {
        logger.info("fetching All the student data ");
        List<Student> students= studentRepository.findAll();
        List<StudentDto> studentDtos=studentMapper.toDtoList(students);
        return studentDtos;


    }






























































}
