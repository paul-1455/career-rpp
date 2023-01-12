package com.paul.career;

import org.springframework.stereotype.Repository;

@Repository
public interface CareerJpaRepository {
    CareerJpaEntity find();
}
