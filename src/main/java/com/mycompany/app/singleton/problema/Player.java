package com.mycompany.app.singleton.problema;

public class Player {
    private int id;

    public Player(IDGenerator generator) {
        this.id = generator.generateId();
    }

    public void showId() {
        System.out.println("Jugador con ID: " + id);
    }
}
