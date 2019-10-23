package com.mk.xebia.solid.srp;

import java.util.HashMap;
import java.util.Map;

public class Login {
    public static void main(String[] args) {
        String email = "username@myapp.com";
        String password = "My $ecurE P@$$w0rd";

        Map<String,String> validUsers = new HashMap();
        validUsers.put("username@myapp.com".toUpperCase(),"My $ecurE P@$$w0rd");
        validUsers.put("admin".toUpperCase(),"@dm1n");
        validUsers.put("user".toUpperCase(),"p@$$w0rd");

        if(validUsers.containsKey(email.toUpperCase())){
            if(validUsers.get(email).equals(password)){
                System.out.println("Congratulations "+email+"! You have successfully logged in.");
            }
            else {
                System.out.println("Are you sure you have provided correct password?");
            }
        }
        else {
            System.out.println("Are you sure you have provided correct username?");
        }
    }
}
