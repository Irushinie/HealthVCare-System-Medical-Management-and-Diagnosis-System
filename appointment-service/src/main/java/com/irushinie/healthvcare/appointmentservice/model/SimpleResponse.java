package com.irushinie.healthvcare.appointmentservice.model;

import com.irushinie.healthvcare.commons.model.appointment.Appointment;

public class SimpleResponse implements Response{

    Appointment appointment;

    public SimpleResponse(Appointment appointment) {
        this.appointment = appointment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }


}
