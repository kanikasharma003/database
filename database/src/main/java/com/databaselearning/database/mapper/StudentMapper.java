package com.databaselearning.database.mapper;

import com.databaselearning.database.dto.StudentDto;
import com.databaselearning.database.model.Student;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student);
    List<StudentDto>  toDtoList(List<Student> studentList);
}
