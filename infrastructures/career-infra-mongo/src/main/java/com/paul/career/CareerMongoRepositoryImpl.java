package com.paul.career;

import org.springframework.stereotype.Repository;

@Repository
public class CareerMongoRepositoryImpl implements CareerMongoRepository {
    @Override
    public CareerMongoDocument findById() {
        return new CareerMongoDocument("mongo");
    }
}
