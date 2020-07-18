/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shazana Affandi
 */
public class NewStaff {
    
    private String staffID; 
    private String startingDate;
    private String icNumber;
    private String name;
    private String Gender;
    private String position; 
    private String username;
    private String password;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public NewStaff(String staffID, String startingDate, String icNumber, String name, String Gender, String position, String username, String password, String address, String phoneNumber, String emailAddress)
    {
        this.staffID = staffID;
        this.startingDate = startingDate;
        this.icNumber = icNumber;
        this.name = name;
        this.Gender = Gender;
        this.position = position;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getStaffID() 
    {
        return staffID;
    }

    public void setStaffID(String staffID) 
    {
        this.staffID = staffID;
    }

    public String getStartingDate() 
    {
        return startingDate;
    }

    public void setStartingDate(String startingDate) 
    {
        this.startingDate = startingDate;
    }

    public String getIcNumber() 
    {
        return icNumber;
    }

    public void setIcNumber(String icNumber) 
    {
        this.icNumber = icNumber;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getGender() 
    {
        return Gender;
    }

    public void setGender(String Gender) 
    {
        this.Gender = Gender;
    }

    public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }
}
