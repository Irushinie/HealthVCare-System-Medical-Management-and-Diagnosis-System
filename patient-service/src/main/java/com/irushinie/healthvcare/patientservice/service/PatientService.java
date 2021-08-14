package com.irushinie.healthvcare.patientservice.service;

import com.irushinie.healthvcare.commons.model.patient.Patient;

import java.util.List;

public interface PatientService {

    Patient save(Patient patient);

    List<Patient> findAll();
//    Optional<Patient> findByGender(String gender);
    String deletePatient(Integer id);
    Patient findById(int id);

    String updatePatientById(int id, Patient patient);
}
