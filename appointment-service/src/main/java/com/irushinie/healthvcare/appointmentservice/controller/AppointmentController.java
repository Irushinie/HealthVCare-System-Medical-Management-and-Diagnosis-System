package com.irushinie.healthvcare.appointmentservice.controller;

import com.irushinie.healthvcare.appointmentservice.model.Response;
import com.irushinie.healthvcare.appointmentservice.model.SimpleResponse;
import com.irushinie.healthvcare.appointmentservice.service.AppointmentService;
import com.irushinie.healthvcare.commons.model.appointment.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/appointmentservices")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    //save appointment
    @RequestMapping(value = "/appointments",method = RequestMethod.POST)
    public Appointment save(@RequestBody Appointment appointment){
        return appointmentService.save(appointment);
    }

    //get all appointments
    @RequestMapping(value = "/appointments",method = RequestMethod.GET)
    public List<Appointment> findAllAppointments() {
        return appointmentService.findAll();
    }

    //get appointments by id
    @GetMapping(value = "/appointments/appointments/{id}")
    public Appointment getAppointmentsbyID(@PathVariable int id) {

        return appointmentService.findById(id);
    }


    //get doctors and patients by id
    @GetMapping(value = "appointments/{id}")
    public Response getAppointment(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return new SimpleResponse(appointmentService.findById(id));
        }else{
            return  appointmentService.findDetailResponse(id);
        }
    }

    //delete appointments
    @RequestMapping(value = "/appointments/{id}",method = RequestMethod.DELETE)
    public String deleteAppointment(@PathVariable("id") Integer id) {
        return appointmentService.deleteAppointment(id);
    }




}
