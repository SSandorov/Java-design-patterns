package com.mycompany.app.factoryMethod.solucion;

public class GoblinFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
    
}
