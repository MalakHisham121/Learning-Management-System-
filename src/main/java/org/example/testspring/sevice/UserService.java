package org.example.testspring.sevice;

import org.example.testspring.api.User;
import org.example.testspring.dto.Iuser;

public class UserService {

    private final Iuser iuser;

    public UserService(Iuser iuser) {
        this.iuser = iuser;
    }

//    public  AddUser(User user){
//        return  iuser.AddUser(user);
//    }
}
