package com.mycompany.app.singleton.solucion;

public class Player {
    private final int id;

    public Player() {
        this.id = IDGenerator.getInstance().generateID();
    }

    public void showId() {
        System.out.println("Jugador con ID: " + id);
    }
}
