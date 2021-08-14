package com.irushiniehealthvcare.pressureservice.service;

import com.irushinie.healthvcare.commons.model.patient.Patient;
import com.irushinie.healthvcare.commons.model.pressure.Pressure;
import com.irushiniehealthvcare.pressureservice.repository.PressureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PressureServiceImpl implements PressureService{

    @Autowired
    PressureRepository pressureRepository;

    @Override
    public Pressure save(Pressure pressure) {
        return pressureRepository.save(pressure);
    }

    @Override
    public List<Pressure> findAll() {
        return pressureRepository.findAll();
    }

    @Override
    public Pressure findByInputPressure(int inputPressure) {
        Optional<Pressure> pressure = pressureRepository.findByInputPressure(inputPressure);
        return pressure.get();

    }
}
