package com.mycompany.app.observer.solucion;

public class AchievementTracker implements Observer {

    @Override
    public void update(int health) {
        if (health < 50) System.out.println("Logro desbloqueado: Estas herido, pero sigues en pie!");
    }
    
}
