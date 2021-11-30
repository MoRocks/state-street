package com.ahmed.statestreet.service;

import com.ahmed.statestreet.dao.entity.JpaStudentEntity;
import com.ahmed.statestreet.model.CreateStudentRequest;
import com.ahmed.statestreet.dao.entity.JpaCourseEntity;
import com.ahmed.statestreet.dao.entity.JpaRegistrationEntity;
import com.ahmed.statestreet.dao.repository.JpaCourseRepository;
import com.ahmed.statestreet.dao.repository.JpaStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseRegistrationService {

    @Autowired
    private JpaStudentRepository jpaStudentRepository;

    @Autowired
    private JpaCourseRepository jpaCourseRepository;

    public JpaStudentEntity createStudents(CreateStudentRequest createStudentRequest){
        JpaStudentEntity student = addCourseRegistration(createStudentRequest);
        return jpaStudentRepository.save(student);
    }

    public void delete(int id){
        jpaStudentRepository.deleteById(id);
    }

    public List<JpaStudentEntity> getAllStudentsWithCourseName(String courseName) {
        return jpaStudentRepository.findAllByCoursesRegisteredCourseNameOrderByName(courseName);
    }

    private JpaStudentEntity addCourseRegistration(CreateStudentRequest createStudentRequest) {
        JpaStudentEntity jpaStudentEntity = new JpaStudentEntity();
        jpaStudentEntity.setName(createStudentRequest.name);

        JpaCourseEntity jpaCourseEntity = jpaCourseRepository.getById(createStudentRequest.getRegisteredCourseId());
        JpaRegistrationEntity jpaRegistrationEntity = new JpaRegistrationEntity();
        jpaRegistrationEntity.setCourse(jpaCourseEntity);
        jpaRegistrationEntity.setStudent(jpaStudentEntity);
        return jpaStudentEntity;
    }
}
