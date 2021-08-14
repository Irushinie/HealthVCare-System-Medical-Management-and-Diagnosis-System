package com.irushiniehealthvcare.pressureservice.service;

import com.irushinie.healthvcare.commons.model.pressure.Pressure;

import java.util.List;

public interface PressureService {

    Pressure findByInputPressure(int inputPressure);
    Pressure save(Pressure pressure);

    List<Pressure> findAll();
}
