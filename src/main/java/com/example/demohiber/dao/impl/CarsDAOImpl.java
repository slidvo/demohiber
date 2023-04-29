package com.example.demohiber.dao.impl;

import com.example.demohiber.dao.interfaces.CarsDAO;
import com.example.demohiber.entity.CarEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarsDAOImpl implements CarsDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<CarEntity> getCars() {
        return entityManager.createQuery("select c from CarEntity c").getResultList();
    }
}
