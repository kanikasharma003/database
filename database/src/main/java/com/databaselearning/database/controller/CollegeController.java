//package com.databaselearning.database.controller;
//
//import com.databaselearning.database.model.College;
//import com.databaselearning.database.model.Student;
//import com.databaselearning.database.service.CollegeService;
//import com.databaselearning.database.service.StudentService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/college")
//public class CollegeController {
//
//    private static final Logger logger = LoggerFactory.getLogger(CollegeController.class);
//    @Autowired
//    private CollegeService collegeService;
//
//    @PostMapping({"/createCollege"})
//    public College createCollege(@RequestBody College college) {
//        logger.info("POST /college called with body: {}", college);
//        return this.collegeService.createCollege(college);
//    }
//}
