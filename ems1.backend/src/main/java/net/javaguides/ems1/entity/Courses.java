package net.javaguides.ems1.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import java.util.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Courses")
public class Courses {
   @Id
   private long Course_Id;
   @Column(name="Title")
   private String Title;
   @Column(name="Description")
   private String Description;
   @Column(name="Duration")
   private String Duration;

    @OneToMany(mappedBy = "cources", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<questionBank> questions;
   
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lessons> lessons;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;
}
