package com.irushinie.healthvcare.appointmentservice.model;

import com.irushinie.healthvcare.commons.model.appointment.Appointment;
import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import com.irushinie.healthvcare.commons.model.patient.Patient;

public class AppointmentDetailResponse implements Response{

    Appointment appointment;
    Doctor doctor;
    Patient patient;

    public AppointmentDetailResponse(Appointment appointment, Doctor doctor, Patient patient) {
        this.appointment= appointment;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }



}
