package com.paul.career;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CareerMongoRepositoryAdapter implements CareerRepository {

    private final CareerMongoRepository careerMongoRepository;

    @Override
    public Career find() {
        return convert(careerMongoRepository.findById());
    }

    private Career convert(CareerMongoDocument careerMongoDocument) {
        return new Career(careerMongoDocument.getContents());
    }
}
