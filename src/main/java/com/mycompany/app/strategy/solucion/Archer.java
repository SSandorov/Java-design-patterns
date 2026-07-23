package com.mycompany.app.strategy.solucion;

public class Archer extends GameCharacter {
    private String name;

    public Archer(String name) {
        super(name);
        this.attackStrategy = new BowAttack();
    }


    
}
