package com.example.demohiber.mapper;

import com.example.demohiber.entity.CarEntity;
import com.example.demohiber.model.Car;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarsMapper {

    Car entityToCar(CarEntity carEntity);

    List<Car> entitiesToCar(List<CarEntity> carEntities);
}
