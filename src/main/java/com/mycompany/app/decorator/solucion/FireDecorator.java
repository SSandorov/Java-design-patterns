package com.mycompany.app.decorator.solucion;

public class FireDecorator extends WeaponDecorator {

    public FireDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);
    }
    
    public void attack() {
        super.attack();
        System.out.println("Dano de fuego adicional");
    }
}
