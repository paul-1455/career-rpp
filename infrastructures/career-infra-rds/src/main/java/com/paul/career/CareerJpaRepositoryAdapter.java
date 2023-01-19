package com.paul.career;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CareerJpaRepositoryAdapter implements CareerRepository {
    private final CareerJpaRepository careerJpaRepository;

    public Career find() {
        return convert(careerJpaRepository.find());
    }

    private Career convert(CareerJpaEntity careerJpaEntity) {
        return new Career(careerJpaEntity.getContents());
    }
}
