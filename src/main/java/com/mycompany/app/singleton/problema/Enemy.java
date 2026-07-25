package com.mycompany.app.singleton.problema;

public class Enemy {
    private int id;

    public Enemy(IDGenerator generator) {
        this.id = generator.generateId();
    }

    public void showId() {
        System.out.println("Enemigo con ID: " + id);
    }
}
