package com.mycompany.app.builder.solucion;

public class Game {
    public static void main(String[] args) {
        // GameCharacter mage = new GameCharacter
        //     .Builder()
        //     .withName("Lyra")
        //     .withType("Mage")
        //     .build();

        // mage.showStats();

        Character character = new Character
            .CharacterBuilder()
            .name("Gabriel")
            .build();

            character.showStats();

    }
}
