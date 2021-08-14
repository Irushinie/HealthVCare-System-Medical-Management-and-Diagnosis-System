package com.irushinie.healthvcare.patientservice.repository;

import com.irushinie.healthvcare.commons.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
//    Optional<Patient> findByGender(String gender);



}
