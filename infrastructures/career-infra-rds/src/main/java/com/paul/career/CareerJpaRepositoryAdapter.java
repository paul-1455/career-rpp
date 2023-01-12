package com.paul.career;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "career.infra.mongo", havingValue = "none")
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
