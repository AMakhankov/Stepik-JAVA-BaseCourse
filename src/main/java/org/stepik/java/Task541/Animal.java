package org.stepik.java.Task541;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
