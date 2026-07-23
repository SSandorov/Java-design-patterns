package com.mycompany.app.strategy.solucion;

public class MagicAttack implements AttackStrategy {

    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " dispara una bola de fuego.");
    }
    
}
