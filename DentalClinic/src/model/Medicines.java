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
public class Medicines {
    
    private String medicineID;
    private String medicineName;
    private String expiryDate;
    private String quantity;

    public Medicines(String medicineID, String medicineName, String expiryDate, String quantity) 
    {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public String getMedicinesID() 
    {
        return medicineID;
    }

    public void setMedicinesID(String medicineID) 
    {
        this.medicineID = medicineID;
    }

    public String getExpiryDate() 
    {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) 
    {
        this.expiryDate = expiryDate;
    }

    public String getMedicineName() 
    {
        return medicineName;
    }

    public void setMedicineName(String medicineName) 
    {
        this.medicineName = medicineName;
    }

    public String getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(String quantity) 
    {
        this.quantity = quantity;
    }
}