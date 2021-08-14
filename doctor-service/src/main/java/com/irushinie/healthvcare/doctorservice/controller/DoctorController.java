package com.irushinie.healthvcare.doctorservice.controller;

import com.irushinie.healthvcare.commons.model.doctor.Doctor;
import com.irushinie.healthvcare.doctorservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctorservices")
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    //save doctors
    @RequestMapping(value = "/doctors",method = RequestMethod.POST)
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.save(doctor);
    }

    //show all doctors
    @RequestMapping(value = "/doctors",method = RequestMethod.GET)
    public List<Doctor> findAllDoctors() {

        return doctorService.findAll();
    }

    //find doctor by id
    @GetMapping(value = "/doctors/{id}")
    public Doctor getDoctor(@PathVariable int id) {

        return doctorService.findById(id);
    }


    //delete doctor y id
    @RequestMapping(value = "/doctors/{id}",method = RequestMethod.DELETE)
    public String deleteDoctor(@PathVariable("id") Integer id) {
        return doctorService.deleteDoctor(id);
    }

    //update doctor
    @RequestMapping(value = "/doctors/{id}",method = RequestMethod.POST)
    public String updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctorById(id,doctor);
    }


//find by doctor type
}
