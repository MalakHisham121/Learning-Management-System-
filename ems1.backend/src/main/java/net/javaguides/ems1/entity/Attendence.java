package net.javaguides.ems1.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Attendence")
public class Attendence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Attandence_Id;
    @Column(name="otp")
    private String otp;
    @Column (name="status")
    private String status;
     @ManyToOne
    @JoinColumn(name = "User_Id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Lesson_Id", nullable = false)
    private Lessons lesson;
}
