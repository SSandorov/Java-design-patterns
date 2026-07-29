package com.mycompany.app.decorator.solucion;

//* Esta es la denominada clase decoradora abstracta
public abstract class WeaponDecorator implements Weapon {

    protected Weapon decoratedWeapon;

    public WeaponDecorator(Weapon decoratedWeapon) {
        this.decoratedWeapon = decoratedWeapon;
    }

    public void attack() {
        decoratedWeapon.attack();
    }
    
}
