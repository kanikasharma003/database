package com.databaselearning.database.service;

import com.databaselearning.database.model.College;
import com.databaselearning.database.model.Student;
import com.databaselearning.database.repository.CollegeRepository;
import com.databaselearning.database.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
    public static final Logger logger = LoggerFactory.getLogger(CollegeService.class);
    @Autowired
    private CollegeRepository collegeRepository;

    public College createCollege(College college) {

        logger.info("Creating college: {}", college.getName());
        this.collegeRepository.save(college);
        logger.info("Created college: {}", college.getName());
        return college;
    }
}
