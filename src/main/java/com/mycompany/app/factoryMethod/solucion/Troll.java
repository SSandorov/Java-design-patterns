package com.mycompany.app.factoryMethod.solucion;

public class Troll extends Enemy {

    public Troll() {
        this.name = "Troll";
    }

    @Override
    public void attack() {
        System.out.println(name + " golpea con su maza");
    }
    
}
