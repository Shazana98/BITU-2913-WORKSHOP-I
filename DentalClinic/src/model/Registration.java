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
public class Registration {
    
    private String patientID;
    private String patientName;
    private String icNumber;
    private String gender;
    private String date;
    private String address;
    private String mobilePhone;
    private String emailAddress;

    public Registration(String patientID, String patientName, String icNumber, String gender, String date, String address, String mobilePhone, String emailAddress) 
    {
        this.patientID = patientID;
        this.patientName = patientName;
        this.icNumber = icNumber;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.emailAddress = emailAddress;
    }

    public String getPatientID() 
    {
        return patientID;
    }

    public void setPatientID(String patientID) 
    {
        this.patientID = patientID;
    }

    public String getPatientName() 
    {
        return patientName;
    }

    public void setPatientName(String patientName) 
    {
        this.patientName = patientName;
    }

    public String getIcNumber() 
    {
        return icNumber;
    }

    public void setIcNumber(String icNumber) 
    {
        this.icNumber = icNumber;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getMobilePhone() 
    {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) 
    {
        this.mobilePhone = mobilePhone;
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