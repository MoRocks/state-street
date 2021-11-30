package com.ahmed.statestreet.controller;

import com.ahmed.statestreet.dao.entity.JpaStudentEntity;
import com.ahmed.statestreet.model.CreateStudentRequest;
import com.ahmed.statestreet.service.StudentCourseRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentCourseRegistrationController {

    @Autowired
    private StudentCourseRegistrationService service;

    @GetMapping()
    public List<JpaStudentEntity> findAllByCourseName(@RequestParam String courseName) {
        return service.getAllStudentsWithCourseName(courseName);
    }

    @PostMapping
    public ResponseEntity<JpaStudentEntity> create(@RequestBody CreateStudentRequest createStudentRequest) {
        return new ResponseEntity<>(service.createStudents(createStudentRequest), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
