package org.example;

public class LoginUser {

    public String valid(String username, String password){
        if ((username.equals("Silky")) && (password.equals("Silky123"))){
            return ("Login Successful");
        }
        else return "Login Failed";
    }

}
