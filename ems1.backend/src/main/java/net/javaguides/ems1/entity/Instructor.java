package net.javaguides.ems1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.*;

public class Instructor extends Users{
    @OneToMany(mappedBy = "instructor", cascade =CascadeType.ALL, orphanRemoval = true)
    private List<Courses> courses;

}
