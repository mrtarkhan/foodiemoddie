package ir.drp.it.foodiemoodie.models.userModels;

import ir.drp.it.foodiemoodie.enumerations.UserRole;
import ir.drp.it.foodiemoodie.exceptions.BusinessException;

public class CreateUserModel {

    private String username;
    private String password;
    private String mobileNumber;
    private String firstName;
    private String lastName;
    private UserRole role;


    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void validate() {
        if (this.username.isEmpty())
            throw new BusinessException("نام کاربری الزامی است");

        if (this.password.isEmpty())
            throw new BusinessException("کلمه عبور الزامی است");

        if (this.firstName.isEmpty())
            throw new BusinessException("نام الزامی است");

        if (this.lastName.isEmpty())
            throw new BusinessException("نام خانوادگی الزامی است");

        if (this.mobileNumber.isEmpty())
            throw new BusinessException("شماره موبایل الزامی است");
    }

}
