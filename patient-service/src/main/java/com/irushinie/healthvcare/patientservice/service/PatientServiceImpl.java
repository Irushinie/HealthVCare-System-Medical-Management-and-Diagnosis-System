package com.irushinie.healthvcare.patientservice.service;

import com.irushinie.healthvcare.commons.model.patient.Patient;
import com.irushinie.healthvcare.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }


    @Override
    public String updatePatientById(int id, Patient patient) {
        Patient p1 = findById(id);
        p1.setFirstName(patient.getFirstName());
        p1.setLastName(patient.getLastName());
        p1.setAge(patient.getAge());
        p1.setGender(patient.getGender());
        p1.setHomeAddress(patient.getHomeAddress());
        p1.setPhoneNumber(patient.getPhoneNumber());
        save(p1);

        return "New Details were Updated successfully!!";
    }

    @Override
    public String deletePatient(Integer id) {
        patientRepository.delete(findById(id));
        return "The record deleted successfully!";
    }

    @Override
    public Patient findById(int id) {
        Optional<Patient> patient = patientRepository.findById(id);

        if (patient.isPresent())
            return patient.get();
        else
            return new Patient();
    }


}