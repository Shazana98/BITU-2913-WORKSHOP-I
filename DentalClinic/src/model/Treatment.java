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
public class Treatment {
    
    private String treatmentNum;
    private String date;
    private String patientID;
    private String patientName;
    private String treatment;
    private String medicines;

    public Treatment(String treatmentNum, String date, String patientID, String patientName, String treatment, String medicines) 
    {
        this.treatmentNum = treatmentNum;
        this.date = date;
        this.patientID = patientID;
        this.patientName = patientName;;
        this.treatment = treatment;
        this.medicines = medicines;
    }

    public String getTreatmentNum() 
    {
        return treatmentNum;
    }

    public void setTreatmentNum(String treatmentNum) 
    {
        this.treatmentNum = treatmentNum;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
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

    public String getTreatment() 
    {
        return treatment;
    }

    public void setTreatment(String treatment) 
    {
        this.treatment = treatment;
    }

    public String getMedicines() 
    {
        return medicines;
    }

    public void setMedicines(String medicines) 
    {
        this.medicines = medicines;
    }
}
