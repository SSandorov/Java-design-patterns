package com.mycompany.app.decorator.solucion;

public class PoisonDecorator extends WeaponDecorator {

    public PoisonDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);
    }
    
    public void attack() {
        super.attack();
        System.out.println("Dano de veneno adicional");
    }
}
