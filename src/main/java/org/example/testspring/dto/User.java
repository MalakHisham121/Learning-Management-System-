package org.example.testspring.dto;




import java.util.ArrayList;
import java.util.List;

public class User implements Iuser {
    private static List<User>DB = new ArrayList<>();
    public void  AddUser(String name,String email,String Password,String Profileinfo){
    DB.add(new User()); // user have to take the attributes
    }
    public void  AddUser(User user){
    DB.add(user); // user have to take the attributes
    }
}
