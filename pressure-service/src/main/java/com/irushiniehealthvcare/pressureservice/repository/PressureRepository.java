package com.irushiniehealthvcare.pressureservice.repository;

import com.irushinie.healthvcare.commons.model.pressure.Pressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PressureRepository extends JpaRepository<Pressure,Integer> {

  Optional<Pressure> findByInputPressure(int inputPressure);

}
