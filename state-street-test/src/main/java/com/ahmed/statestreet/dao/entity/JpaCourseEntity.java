package com.ahmed.statestreet.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Course")
public class JpaCourseEntity {

    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "course")
    private List<JpaRegistrationEntity> registeredStudents;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
