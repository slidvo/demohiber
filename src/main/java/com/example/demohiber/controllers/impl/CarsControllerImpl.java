package com.example.demohiber.controllers.impl;

import com.example.demohiber.controllers.interfaces.CarsController;
import com.example.demohiber.model.Car;
import com.example.demohiber.service.interfaces.CarsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarsControllerImpl implements CarsController {

    private final CarsService carsService;

    @Override
    public ResponseEntity<List<Car>> getCars() {
        return ResponseEntity.ok(carsService.getCars());
    }
}
