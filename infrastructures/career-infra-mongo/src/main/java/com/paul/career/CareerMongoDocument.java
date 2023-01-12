package com.paul.career;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CareerMongoDocument {
    private Long id;
    private String contents;

    public CareerMongoDocument(String contents) {
        this.contents = contents;
    }
}
