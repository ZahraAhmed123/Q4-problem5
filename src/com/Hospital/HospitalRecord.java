package com.Hospital;

public class HospitalRecord {
    public String patientName;
    int patientID;
    public String address;
    public String phone;
    protected String patientRecords;
    public HospitalRecord(String name, String address, int PID, String phone) {
        this.patientName = name;
        this.patientID = PID;
        this.phone = phone;
        this.address = address;

        System.out.println("Name of the patient :" + this.patientName);
        System.out.println("Patient Name of the patientID :" + this.patientID);
        System.out.println("Address of the patient :" + this.address);
        System.out.println("Phone Number of the patient :" + this.phone);
        System.out.println("Patient Records :" + this.patientRecords);


    }
    public String getPatientRecords() {
        return patientRecords;
    }
    public void setPatientRecords(String patientRecords) {
        this.patientRecords = patientRecords;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

}