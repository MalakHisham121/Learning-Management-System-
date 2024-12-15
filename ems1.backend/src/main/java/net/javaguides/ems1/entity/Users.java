package net.javaguides.ems1.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long User_Id;
    @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="Password")
    private String password;
    @Column(name="ProfileInformation",nullable=false,unique=true)
    private String profileInformation;

    @OneToMany(mappedBy = "Users", cascade =CascadeType.ALL, orphanRemoval = true)
    private List<notification> notifications;

}








   