package com.irushinie.healthvcare.doctorservice.service;


import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import com.irushinie.healthvcare.doctorservice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }



    @Override
    public String deleteDoctor(Integer id) {
        doctorRepository.delete(findById(id));
        return "The record deleted successfully!";
    }
    @Override
    public Doctor findById(int id) {
        Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.get();
    }

    @Override
    public String updateDoctorById(int id, Doctor doctor) {
            Doctor d1 = findById(id);
            d1.setFirstName(doctor.getFirstName());
            d1.setLastName(doctor.getLastName());
            d1.setDoctorType(doctor.getDoctorType());
            d1.setHospitalAddress(doctor.getHospitalAddress());
            d1.setPhoneNumber(doctor.getPhoneNumber());
            save(d1);

            return "New Details were Updated successfully!!";

    }


}

