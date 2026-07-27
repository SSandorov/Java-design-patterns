package com.mycompany.app.observer.solucion;

public class GameLogger implements Observer {

    @Override
    public void update(int health) {
        System.out.println("Registro: salud del jugador = " + health);
    }
    
}
