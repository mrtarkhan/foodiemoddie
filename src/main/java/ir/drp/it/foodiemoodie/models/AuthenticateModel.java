package ir.drp.it.foodiemoodie.models;

import ir.drp.it.foodiemoodie.exceptions.BusinessException;

public class AuthenticateModel {

    private String username;
    private String password;

    public AuthenticateModel(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validate() {

        if (this.username.isEmpty())
            throw new BusinessException("نام کاربری الزامی است");

        if (this.password.isEmpty())
            throw new BusinessException("کلمه عبور الزامی است");

    }

}
