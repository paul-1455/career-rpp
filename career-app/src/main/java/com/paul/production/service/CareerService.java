package com.paul.production.service;

import com.paul.career.Career;
import com.paul.career.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CareerService {

    private final CareerRepository careerRepository;

    public Career findCareer() {
        return careerRepository.find();
    }
}
