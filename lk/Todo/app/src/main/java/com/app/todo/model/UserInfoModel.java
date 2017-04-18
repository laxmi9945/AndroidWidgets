package com.app.todo.model;

/**
 * Created by bridgeit on 15/4/17.
 */

public class UserInfoModel {
    String Name;
    String Email;
    String Password;
    int Mobile;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getMobile() {
        return Mobile;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }
}
