package org.example.testspring.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.*;
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
@Table(name="notification")
public class notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notification_Id;
    //fk users
     @ManyToOne
    @JoinColumn(name = " User_Id", nullable = false)
    private Users user_Id;

    @Column(name = "message")
    private String message;
    @Column(name = "IsRead")
    private boolean IsRead;
    @Column(name = "Created_on")
    private  Date Created_on ;

}

