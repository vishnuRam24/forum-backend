package com.ce.forim.Forum.Service;

import com.ce.forim.Forum.Implementation.LoginImpl;
import com.ce.forim.Forum.Model.Login;
import com.ce.forim.Forum.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlService {

    @Autowired
    public LoginImpl loginImpl;

    @PostMapping("/login")
    public void login(@RequestBody Login loginData){
        System.out.println(loginData);
        loginImpl.loginCheck(loginData);
    }

    @PostMapping("/newUser")
    public String newUser(@RequestBody Users User){
        loginImpl.newUser(User);

        return "Successfully created";
    }


}
