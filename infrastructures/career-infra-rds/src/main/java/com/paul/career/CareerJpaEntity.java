package com.paul.career;

import lombok.Getter;

@Getter
public class CareerJpaEntity {
    private Long id;
    private String contents;

    public CareerJpaEntity(String contents) {
        this.contents = contents;
    }
}
