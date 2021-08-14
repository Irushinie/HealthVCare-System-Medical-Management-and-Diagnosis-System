package com.irushinie.healthvcare.appointmentservice.repository;

import com.irushinie.healthvcare.commons.model.appointment.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
}
