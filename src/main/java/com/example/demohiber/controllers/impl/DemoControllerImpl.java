package com.example.demohiber.controllers.impl;


import com.example.demohiber.controllers.interfaces.DemoController;
import com.example.demohiber.rq.CarsRqBody;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DemoControllerImpl implements DemoController {

    @Override
    public String greeting() {
        return "Hello! Program is working!";
    }

    @Override
    public UsersRs getUsers() {
        return new UsersRs(List.of(new User("Slidvo", 34)));
    }

    @Override
    public ResponseEntity<CarsRs> getCars(@RequestBody CarsRqBody requestBody) {
        if (requestBody.model().equals("BMW"))
            return ResponseEntity.ok(new CarsRs(List.of(new Car(1L, "BMW:M1"), new Car(2L, "BMW:X6"))));
        if (requestBody.model().equals("Mercedes"))
            return ResponseEntity.ok(new CarsRs(List.of(new Car(1L, "Mercedes:Benz"), new Car(2L, "Mercedes:600"))));
        return ResponseEntity.status(404).body(null);
    }

    @Override
    public ResponseEntity<DeleteCarRs> deleteCar(@PathVariable Long id) {
        //TODO
        return new ResponseEntity<>(new DeleteCarRs("Запись о машине успешно удалена", id), HttpStatus.OK);
    }

}
