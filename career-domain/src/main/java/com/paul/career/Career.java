package com.paul.career;

import lombok.Getter;

@Getter
public class Career {
    private String contents;

    public Career(String contents) {
        this.contents = contents;
    }
}
