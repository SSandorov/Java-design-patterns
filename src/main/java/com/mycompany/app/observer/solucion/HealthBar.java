package com.mycompany.app.observer.solucion;

public class HealthBar implements Observer {

    @Override
    public void update(int health) {
        System.out.println("Barra de saluf actualizada: " + health);
    }
    
}
