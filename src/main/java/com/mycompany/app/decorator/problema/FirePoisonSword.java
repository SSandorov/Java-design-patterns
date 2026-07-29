package com.mycompany.app.decorator.problema;

public class FirePoisonSword extends Sword {
    @Override
    public void attack() {
        super.attack();
        System.out.println("Dano de fuego adicional");
        System.out.println("Dano de veneno adicional");
    }
}
