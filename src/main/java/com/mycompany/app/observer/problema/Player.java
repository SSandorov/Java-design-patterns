package com.mycompany.app.observer.problema;

public class Player {
    private int health;

    public Player() {
        this.health = 100;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("El jugador recibio " + damage + " de dano. Salud actual: " + health);

        updateHealth();
        logDamage();
        checkAchievements();

    }

    private void updateHealth() {
        System.out.println("Barra de saluf actualizada: " + health);
    }

    private void logDamage() {
        System.out.println("Registro: salud del jugador = " + health);
    }

    private void checkAchievements() {
        if (health < 50) System.out.println("Logro desbloqueado: Estas herido, pero sigues en pie!");
    }

}
