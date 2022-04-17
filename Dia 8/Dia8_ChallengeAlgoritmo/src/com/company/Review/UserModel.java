package com.company.Review;

public class UserModel {
    private String userName;
    private String mail;
    private String password;
    private String country;
    private Type type;

    enum Type{
        BASIC,PREMIUM;
    }
}
