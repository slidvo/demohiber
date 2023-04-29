package com.example.demohiber.controllers.interfaces;


import com.example.demohiber.rq.CarsRqBody;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public interface DemoController {

    @GetMapping("greeting")
    String greeting();

    @GetMapping("users")
    UsersRs getUsers();

    @PostMapping("cars")
    ResponseEntity<CarsRs> getCars(@RequestBody CarsRqBody requestBody);

    @DeleteMapping("car/{id}")
    ResponseEntity<DeleteCarRs> deleteCar(@PathVariable Long id);


    public record DeleteCarRs(String msg, Long id) {

    }


    public record CarsRs(List<Car> cars) {

    }

    public record Car(Long id, String name) {
    }

    public record UsersRs(List<User> users) {
    }

    public record User(String name, int age) {
    }

}
