package com.ce.forim.Forum.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Users")
public class Users {



    private String empId;

    private String empName;

    private String email;

    private String password;

    public Users() {
    }

    public Users(Long id, String empId, String empName, String email, String password) {
//        this.id = id;
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.password = password;
    }

    public Users(String empId, String empName, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.password = password;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
