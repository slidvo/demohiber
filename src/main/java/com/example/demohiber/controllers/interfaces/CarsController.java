package com.example.demohiber.controllers.interfaces;

import com.example.demohiber.model.Car;
import com.example.demohiber.service.interfaces.CarsService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public interface CarsController {
    @GetMapping
    public ResponseEntity<List<Car>> getCars();
}
