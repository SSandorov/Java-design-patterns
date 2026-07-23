package com.mycompany.app.strategy.problema;

public class Warrior {
    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + "ataca con una espada.");
    }
}
