package com.mycompany.app.strategy.problema;

public class Mage {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " dispara una bola de fuego.");
    }
}
