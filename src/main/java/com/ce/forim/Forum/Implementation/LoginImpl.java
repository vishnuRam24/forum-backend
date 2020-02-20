package com.ce.forim.Forum.Implementation;

import com.ce.forim.Forum.Model.Login;
import com.ce.forim.Forum.Model.Users;
import com.ce.forim.Forum.Repo.ILogin;
import com.ce.forim.Forum.Repo.INewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl {
    @Autowired
    public ILogin login;

    @Autowired
    public INewUser newUser;

    public void loginCheck(Login loginData) {
        login.save(new Login(loginData.getUsername(), loginData.getPassword()));
        System.out.println("it is inside the login check method");
    }


    public void newUser(Users user) {
        try {
            System.out.println("it is inside the try method");
//            newUser.save(new Users(0L,user.getEmpId(), user.getEmpName(), user.getEmail(), user.getPassword()));
                newUser.save(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
