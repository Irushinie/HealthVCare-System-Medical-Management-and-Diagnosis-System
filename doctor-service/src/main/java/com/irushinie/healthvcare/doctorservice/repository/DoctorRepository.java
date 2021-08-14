package com.irushinie.healthvcare.doctorservice.repository;

import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {


}




