package com.mycompany.app.strategy;

import com.mycompany.app.strategy.solucion.Archer;
import com.mycompany.app.strategy.solucion.GameCharacter;
import com.mycompany.app.strategy.solucion.Mage;
import com.mycompany.app.strategy.solucion.MagicAttack;
import com.mycompany.app.strategy.solucion.Warrior;

public class Main {
    public static void main(String[] args) {
        GameCharacter archer = new Archer("Legolas");
        GameCharacter mage = new Mage("Gandalf");
        GameCharacter warrior = new Warrior("Aragorn");

        archer.attack();
        mage.attack();
        warrior.attack();

        archer.setAttackStrategy(new MagicAttack());
        archer.attack();
    }
}
