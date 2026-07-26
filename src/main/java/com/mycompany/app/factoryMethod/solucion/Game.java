package com.mycompany.app.factoryMethod.solucion;

public class Game {

    public static void main(String[] args) {
        
        EnemyFactory goblinFactory = new GoblinFactory();
        EnemyFactory trollFactory = new TrollFactory();

        Enemy goblin = goblinFactory.createEnemy();
        Enemy troll = trollFactory.createEnemy();

        goblin.attack();
        troll.attack();
        
    }
}
