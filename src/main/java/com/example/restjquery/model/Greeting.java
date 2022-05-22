package com.example.restjquery.model;

import lombok.Data;

@Data
public class Greeting {
    private final Long id;
    private final String content;

    public Greeting() {
        this.id = -1L;
        this.content = "";
    }

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
