package com.databaselearning.database.repository;

import com.databaselearning.database.model.College;
import com.databaselearning.database.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}

