package com.paul.production.api;

import com.paul.production.service.CareerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("careers")
@RequiredArgsConstructor
public class CareerApi {
    private final CareerService careerService;

    @GetMapping("/")
    public ResponseEntity findById() {
        return ResponseEntity.ok(careerService.findCareer());
    }
}
