package com.mycompany.app.singleton.solucion;

public class Enemy {
    private final int id;

    public Enemy() {
        this.id = IDGenerator.getInstance().generateID();
    }

    public void showId() {
        System.out.println("Enemigo con ID: " + id);
    }
}
