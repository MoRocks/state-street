package com.ahmed.statestreet.dao.repository;

import com.ahmed.statestreet.dao.entity.JpaStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaStudentRepository extends JpaRepository<JpaStudentEntity,Integer> {
    List<JpaStudentEntity> findAllByCoursesRegisteredCourseNameOrderByName(String courseName);
}
