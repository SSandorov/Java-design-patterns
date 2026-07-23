package com.mycompany.app.strategy.solucion;

public class MeleeAttack implements AttackStrategy {

    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " ataca cuerpo a cuerpo.");
    }
    
}
