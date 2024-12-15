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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Grades")

public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long Grade_Id;
     @Column(name="feedback")
     private String feedback;
     @OneToOne(mappedBy = "grade")
     private Assignment assignment;
     
}
