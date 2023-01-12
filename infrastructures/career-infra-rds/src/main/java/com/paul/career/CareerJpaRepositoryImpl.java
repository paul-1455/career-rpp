package com.paul.career;

import org.springframework.stereotype.Repository;

@Repository
public class CareerJpaRepositoryImpl implements CareerJpaRepository {
    @Override
    public CareerJpaEntity find() {
        return new CareerJpaEntity("rds");
    }
}
