package com.mycompany.app.command.problema;

import java.util.Scanner;

public class GameProblemDemo {
    public static void main(String[] args) {
        Player player = new Player("Carlos el inmortal");

        Scanner scanner = new Scanner(System.in);

        System.out.println("DEMOSTRACION DEL PROBLEMA (Acoplamiento Directo)");
        System.out.println("Comandos: A (Atacar), D (Defender), I (Item), R (Correr). Escribe 'salida' para salir del programa");

        while (true) {
            System.out.println("Ingresa una accion: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("SALIR")) {
                break;
            }

            if (input.equals("A")) {
                player.attack();
            } else if (input.equals("D")) {
                player.defend();
            } else if (input.equals("I")) {
                player.useItem();
            } else if (input.equals("R")) {
                player.run();
            } else {
                System.out.println("Comando no conocido: " + input);
            }

            System.out.println("-------------------------------------------");
        }

        scanner.close();
        System.out.println("Fin de la demostracion del problema");
    }
}
