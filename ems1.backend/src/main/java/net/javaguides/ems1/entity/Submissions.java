package net.javaguides.ems1.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Submissions")

public class Submissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long Submission_Id;
     @Column(name="FilePath")
     private String FilePath;
     @Column(name="DateOfSumitted_on")
     private Date Submitted_On;

    @ManyToOne
    @JoinColumn(name = " User_Id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Assignment_Id", nullable = false)
    private Assignment assignment;
}
