package com.mycompany.app.strategy.solucion;

public abstract class GameCharacter {
    protected String name;
    protected AttackStrategy attackStrategy;
    
    public GameCharacter(String name) {
        this.name = name;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        if(attackStrategy != null) {
            attackStrategy.attack(name);
        } else {
            System.out.println("No tiene estrategia de ataque.");
        }
    }
}
