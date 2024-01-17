/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import UtilityClasses.JsonFileHandler;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rolis
 */
public class User {

    private String userId;
    private String password;
    private Boolean isVerified = false;
    private Date dateRegistered;
    private Boolean loginStatus = false;

    public User(String userId, String password) throws IOException {
        this.userId = userId;
        this.password = password;
        if (!userId.equals("") && !password.equals("")) {
            authenticateLogin();
        }
    }

    /* userId getter/setter */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    /* password getter/setter */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    /* isVerified getter/setter */
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    /* date of registration getter/setter */
    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    /* login status getter/setter */
    public void setLoginStatus(Boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Boolean getLoginStatus() {
        return loginStatus;
    }

    public void authenticateLogin() throws IOException {
        setLoginStatus(JsonFileHandler.compareLoginCredentials(JsonFileHandler.getEmployeesJSON(), "employeeNum", userId, "last_name", password));
    }
}
