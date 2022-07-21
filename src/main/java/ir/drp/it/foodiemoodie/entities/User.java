package ir.drp.it.foodiemoodie.entities;

import ir.drp.it.foodiemoodie.enumerations.UserRole;
import ir.drp.it.foodiemoodie.exceptions.BusinessException;

import javax.persistence.*;

@Entity(name = "users")
public class User extends BaseEntity{

    //<editor-fold desc="fields">
    @Column(length = 100)
    private String username;

    @Column(length = 512)
    private String password;

    @Column(length = 512)
    private String passwordSalt;

    @Column(length = 150)
    private String firstName;

    @Column(length = 150)
    private String lastName;

    @Column(length = 150)
    private String mobileNumber;

    @Column(length = 300)
    private String avatarUrl;

    @Enumerated(EnumType.ORDINAL)
    private UserRole Role;

    private Integer numberOfAllowedGuess;

    //</editor-fold>

    //<editor-fold desc="ctors">
    public User() {

    }

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }
    //</editor-fold>

    //<editor-fold desc="getter/setters">
    public User setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        return this;
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

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public User setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }


    public UserRole getRole() {
        return Role;
    }

    public User setRole(UserRole role) {
        Role = role;
        return this;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getNumberOfAllowedGuess() {
        return numberOfAllowedGuess;
    }

    public void setNumberOfAllowedGuess(Integer numberOfAllowedGuess) {
        this.numberOfAllowedGuess = numberOfAllowedGuess;
    }

    //</editor-fold>

    //<editor-fold desc="business methods">
    public void checkPassword(String password) {

        if (!this.password.equals(password))
            throw new BusinessException("کلمه عبور صحیح نیست");

    }
    //</editor-fold>
}
