package com.example.demohiber.service.impl;

import com.example.demohiber.dao.interfaces.CarsDAO;
import com.example.demohiber.mapper.CarsMapper;
import com.example.demohiber.model.Car;
import com.example.demohiber.service.interfaces.CarsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarsService {

    private final CarsDAO carsDAO;
    private final CarsMapper carsMapper;

    @Override
    public List<Car> getCars() {
        final var carsEntity = carsDAO.getCars();

        return carsMapper.entitiesToCar(carsEntity);
    }
}
