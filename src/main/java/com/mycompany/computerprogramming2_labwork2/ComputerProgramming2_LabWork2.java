/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.computerprogramming2_labwork2;

import Classes.User;
import Classes.EmployeeInformation;
import UtilityClasses.JsonFileHandler;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rolis
 */
public class ComputerProgramming2_LabWork2 {

    public static void main(String[] args) throws IOException {
        // Create a Scanner object
        Scanner userInput = new Scanner(System.in);

        //Ask for username
        System.out.println("Enter username: ");

        //Username input 
        String username = "10001"; // userInput.nextLine();

        //Ask for password
        System.out.println("Enter password: ");

        //Password input 
        String password = "Crisostomo"; // userInput.nextLine();

        //Show if login is successful or not.
        String loginNotification = "User credentials incorrect.";
        
        System.out.println(JsonFileHandler.getEmployeeInformationJSON("employeeNum", username));

        if ((!username.equals("") && !password.equals(""))) {
            //Instantiate User class
            EmployeeInformation userCredentials = new EmployeeInformation(username, password);

            if (userCredentials.getLoginStatus()) {
                loginNotification = "Welcome, " + password;
            }

            System.out.println(loginNotification);
            System.out.println(userCredentials.getEmployeeNumber());
        } else {
            System.out.println(loginNotification);
        }
    }
}
