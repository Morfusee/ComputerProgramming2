/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.IOException;

/**
 *
 * @author Rolis
 */
public class EmployeeInformation extends User {

    private String employeeNumber = getUserId();
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String position;
    private String immediateSupervisor;
    private Float hourlyRate;

    public EmployeeInformation(String userId, String password) throws IOException {
        super(userId, password);
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
}
