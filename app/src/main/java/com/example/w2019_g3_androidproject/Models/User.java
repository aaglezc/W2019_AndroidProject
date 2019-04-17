package com.example.w2019_g3_androidproject.Models;

public class User
{
    private String _userId;
    private String _password;
    private String _loginStatus;

    public User()
    {

    }

    public User(String _userId, String _password, String _loginStatus) {
        this._userId = _userId;
        this._password = _password;
        this._loginStatus = _loginStatus;
    }

    public String get_userId() {
        return _userId;
    }

    public void set_userId(String _userId) {
        this._userId = _userId;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_loginStatus() {
        return _loginStatus;
    }

    public void set_loginStatus(String _loginStatus) {
        this._loginStatus = _loginStatus;
    }
}
