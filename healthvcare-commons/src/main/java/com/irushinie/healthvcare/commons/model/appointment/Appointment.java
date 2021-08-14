package com.irushinie.healthvcare.commons.model.appointment;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int appointmentId;
    int doctorId;
    int patientId;
    String appointmentNo;
    LocalDateTime appointmentOn;
    String doctorType;


    public String getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(String appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getAppointmentOn() {
        return appointmentOn;
    }

    public void setAppointmentOn(LocalDateTime appointmentOn) {
        this.appointmentOn = appointmentOn;
    }





}