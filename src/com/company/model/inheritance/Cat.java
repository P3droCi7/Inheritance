package com.company.model.inheritance;

import com.company.model.Animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound(){
        System.out.println("Cat: meow");
    }
}
