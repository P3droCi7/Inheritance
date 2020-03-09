package com.company;

import com.company.model.Animal;
import com.company.model.inheritance.Cat;
import com.company.model.inheritance.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Cat name");
        Animal dog = new Dog("Dog name");

        cat.giveSound();
        dog.giveSound();
    }
}
