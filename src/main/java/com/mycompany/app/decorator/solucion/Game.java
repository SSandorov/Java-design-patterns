package com.mycompany.app.decorator.solucion;

public class Game {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        sword.attack();

        System.out.println("-------------------------");
        
        Weapon fireSword = new FireDecorator(sword);
        fireSword.attack();
        
        System.out.println("-------------------------");

        Weapon firePosionSword = new PoisonDecorator(fireSword);
        firePosionSword.attack();
    }
}
