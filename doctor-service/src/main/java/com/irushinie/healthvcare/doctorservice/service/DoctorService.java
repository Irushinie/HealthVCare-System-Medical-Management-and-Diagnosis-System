package com.irushinie.healthvcare.doctorservice.service;

import com.irushinie.healthvcare.commons.model.doctor.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor save(Doctor doctor);

    List<Doctor> findAll();
    String deleteDoctor(Integer id);
    Doctor findById(int id);


    String updateDoctorById(int id, Doctor doctor);


}
