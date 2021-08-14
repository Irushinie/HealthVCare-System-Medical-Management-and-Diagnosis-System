package com.irushiniehealthvcare.pressureservice.controller;

import com.irushinie.healthvcare.commons.model.pressure.Pressure;
import com.irushiniehealthvcare.pressureservice.service.PressureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pressureservices")
public class PressureController {

    @Autowired
    PressureService pressureService;

    @RequestMapping(value = "/pressure",method = RequestMethod.POST)
    public Pressure save(@RequestBody Pressure pressure){
        return pressureService.save(pressure);
    }

    @RequestMapping(value = "/pressure",method = RequestMethod.GET)
    public List<Pressure> findAllPressure() {

        return pressureService.findAll();
    }

    @GetMapping(value = "/pressure/{inputPressure}")
    public Pressure getResult(@PathVariable int inputPressure) {
        return pressureService.findByInputPressure(inputPressure);
    }

}
