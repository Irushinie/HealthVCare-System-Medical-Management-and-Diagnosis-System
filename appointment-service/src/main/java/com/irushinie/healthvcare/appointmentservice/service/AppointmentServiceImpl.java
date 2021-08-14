package com.irushinie.healthvcare.appointmentservice.service;

import com.irushinie.healthvcare.appointmentservice.model.AppointmentDetailResponse;
import com.irushinie.healthvcare.appointmentservice.repository.AppointmentRepository;
import com.irushinie.healthvcare.commons.model.appointment.Appointment;
import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import com.irushinie.healthvcare.commons.model.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    AppointmentRepository appointmentRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public AppointmentDetailResponse findDetailResponse(int id) {
        Appointment appointment=findById(id);
        Doctor doctor=getDoctor(appointment.getDoctorId());
        Patient patient= getPatient(appointment.getPatientId());

        return new AppointmentDetailResponse(appointment,doctor,patient);

    }
    @Override
    public Appointment findById(int id) {
        Optional<Appointment> appointment = appointmentRepository.findById(id);

        if (appointment.isPresent())
            return appointment.get();
        else
            return new Appointment();

    }
    private Doctor getDoctor(int doctorId){

        Doctor doctor=restTemplate.getForObject("http://localhost:9191/doctorservices/doctors/"+doctorId,Doctor.class);
        return doctor;

    }

    private Patient getPatient(int patientId){

        return restTemplate.getForObject("http://localhost:9192/patientservices/patients/"+patientId,Patient.class);


    }

    @Override
    public String deleteAppointment(Integer id) {
        appointmentRepository.delete(findById(id));
        return "The record deleted successfully!";
    }




}
