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
public class BookingAppointment {
    
    private String bookingNum;
    private String patientID;
    private String patientName;
    private String date;
    private String time;
    private String dentistID;
    private String dentistName;

    public BookingAppointment(String bookingNum, String patientID, String patientName, String date, String time, String dentistID, String dentistName) {
        this.bookingNum = bookingNum;
        this.patientID = patientID;
        this.patientName = patientName;
        this.date = date;
        this.time = time;
        this.dentistID = dentistID;
        this.dentistName = dentistName;
    }

    public String getBookingNum() 
    {
        return bookingNum;
    }

    public void setBookingNum(String bookingNum) 
    {
        this.bookingNum = bookingNum;
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

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getTime() 
    {
        return time;
    }

    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getDentistID() 
    {
        return dentistID;
    }

    public void setDentistID(String dentistID) 
    {
        this.dentistID = dentistID;
    }

    public String getDentistName() 
    {
        return dentistName;
    }

    public void setDentistName(String dentistName) 
    {
        this.dentistName = dentistName;
    }
}