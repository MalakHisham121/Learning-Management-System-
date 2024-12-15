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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="QuestionBank")

public class questionBank {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long  Question_Id;
    @ManyToOne
    @JoinColumn(name = "Course_Id", nullable = false)//fk cources
   private Courses  Course_Id;
   @Column(name = "Content")
   private String Content;
   @Column(name="Type")
   private String Type;

}
