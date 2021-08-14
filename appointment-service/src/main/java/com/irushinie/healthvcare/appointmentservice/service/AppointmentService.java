package com.irushinie.healthvcare.appointmentservice.service;

import com.irushinie.healthvcare.appointmentservice.model.AppointmentDetailResponse;
import com.irushinie.healthvcare.commons.model.appointment.Appointment;
import com.irushinie.healthvcare.commons.model.doctor.Doctor;

import java.util.List;

public interface AppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();

    Appointment findById(int id);

    AppointmentDetailResponse findDetailResponse(int id);

    String deleteAppointment(Integer id);

}

