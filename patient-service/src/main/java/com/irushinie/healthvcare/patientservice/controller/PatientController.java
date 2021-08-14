package com.irushinie.healthvcare.patientservice.controller;

import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import com.irushinie.healthvcare.commons.model.patient.Patient;
import com.irushinie.healthvcare.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/patientservices")
public class PatientController {

    @Autowired
    PatientService patientService;



    @RequestMapping(value = "/patients",method = RequestMethod.POST)
    public Patient save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @RequestMapping(value = "/patients",method = RequestMethod.GET)
    public List<Patient> findAllPatients() {

        return patientService.findAll();
    }


    @GetMapping(value = "/patients/{id}")
    public Patient getPatient(@PathVariable int id) {

        return patientService.findById(id);
    }


    @RequestMapping(value = "/patients/{id}",method = RequestMethod.POST)
    public String updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        return patientService.updatePatientById(id,patient);
    }

    @RequestMapping(value = "/patients/{id}",method = RequestMethod.DELETE)
    public String deletePatient(@PathVariable("id") Integer id) {
        return patientService.deletePatient(id);
    }
}
