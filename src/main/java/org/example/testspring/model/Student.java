package org.example.testspring.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.*;

public class Student extends Users{
    @OneToMany(mappedBy = "User_Id", cascade =CascadeType.ALL, orphanRemoval = true)
    private List<Assignment> assignments;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "grade_id", referencedColumnName = "Grade_Id")
    private Grades grade;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Submissions> submissions;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attendence> attendanceRecords;
}
