package com.ahmed.statestreet.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
public class JpaStudentEntity {

    @Id
    private int id;
    private String name;

    public List<JpaRegistrationEntity> getCoursesRegistered() {
        return coursesRegistered;
    }
    @OneToMany(mappedBy = "student")
    private List<JpaRegistrationEntity> coursesRegistered= new ArrayList<>();
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
