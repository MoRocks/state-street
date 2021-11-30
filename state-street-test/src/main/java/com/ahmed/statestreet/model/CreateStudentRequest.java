package com.ahmed.statestreet.model;

import lombok.Data;

@Data
public class CreateStudentRequest {
    public int id;
    public String name;
    public int registeredCourseId;
}
