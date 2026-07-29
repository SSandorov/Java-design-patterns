package com.mycompany.app.decorator.problema;

public class PoisonSword extends Sword {

    @Override
    public void attack() {
        super.attack();
        System.out.println("Dano de veneno adicional");
    }
    
}
