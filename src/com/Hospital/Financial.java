package com.Hospital;

public class Financial extends HospitalRecord {
    public String HospitalName;
    public String HospitalAddress;
    private final int patientRecordsBill;

    public Financial(String name, String address, int PID, String phone, String HName, String HAddress, int pRBill) {
        super(name, address, PID, phone);
        this.HospitalName = HName;
        this.HospitalAddress = HAddress;
        this.patientRecordsBill = pRBill;

        System.out.println("Hospital Name: " + this.HospitalName);
        System.out.println("Hospital Address: " + this.HospitalAddress);
        System.out.println("Patient Records of Financial : " + this.patientRecordsBill);
    }
}