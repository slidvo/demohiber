package com.example.demohiber.controllers.impl;

import com.example.demohiber.controllers.interfaces.TestController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestControllerImpl implements TestController {
    @Override
    public ResponseEntity<String> testControllerMethod() {
        return ResponseEntity.ok("Test method is working!");
    }
}
