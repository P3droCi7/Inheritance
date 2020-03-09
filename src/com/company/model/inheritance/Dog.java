package com.company.model.inheritance;

import com.company.model.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Dog: hau");
    }
}
