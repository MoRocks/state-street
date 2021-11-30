package com.ahmed.statestreet.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Registration")
public class JpaRegistrationEntity {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    public JpaStudentEntity student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    public JpaCourseEntity course;

    public void setStudent(JpaStudentEntity student) {
        this.student = student;
    }

    public JpaStudentEntity getStudent(){
        return student;
    }

    public void setCourse(JpaCourseEntity course) {
        this.course = course;
    }

    public JpaCourseEntity getCourse() {
        return course;
    }

}
