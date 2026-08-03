package com.mycompany.app.builder.solucion;

import lombok.Builder;

@Builder
public class Character {
    private String name;
    private String type;
    private int level;
    private int strength;
    private int defense;
    private int magic;
    private int speed;
    private int agility;
    private int experience;

    public void showStats() {
        System.out.println("Personaje: " + (name != null ? name : "Sin nombre"));
        System.out.println("Clase: " + type);
        System.out.println("Nivel: " + level);
        System.out.println("Fuerza: " + strength);
        System.out.println("Defensa: " + defense);
        System.out.println("Magia: " + magic);
        System.out.println("Velocidad: " + speed);
        System.out.println("Agilidad: " + agility);
        System.out.println("Experiencia: " + experience);
    }

}
