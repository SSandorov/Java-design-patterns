package com.mycompany.app.decorator.problema;

public class FireSword extends Sword {

    @Override
    public void attack() {
        super.attack();
        System.out.println("Dano de fuego adicional");
    }
    
    
}
