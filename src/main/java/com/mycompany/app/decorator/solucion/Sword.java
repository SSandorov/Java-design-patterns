package com.mycompany.app.decorator.solucion;

public class Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("Ataque basico con espada");
    }
}
