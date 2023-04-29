package com.example.demohiber.dao.interfaces;

import com.example.demohiber.entity.CarEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsDAO {
    List<CarEntity> getCars();
}
