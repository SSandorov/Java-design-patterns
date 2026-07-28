package com.mycompany.app.command.solucion;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Gabriel");

        Command attack = new AttackCommand(player);
        Command defend = new DefendCommand(player);

        InputHandler inputHandler = new InputHandler();

        inputHandler.bind("A", attack);
        inputHandler.bind("D", defend);

        Scanner scanner = new Scanner(System.in);

        System.out.println("DEMOSTRACION DEL PATRON COMMAND");
        System.out.println("Comandos: A (Atacar), D (Defender)");
        System.out.println("Escribe 'U' para Deshacer la ultima accion");
        System.out.println("Escribe 'SALIR' para salir del programa");

        while (true) { 
            System.out.println("Ingresa una accion: ");
            String input = scanner.nextLine().toUpperCase();
            
            if (input.equals("SALIR")) {
                break;
            }

            if (input.equals("U")) {
                inputHandler.undoLastCommand();
            } else {
                inputHandler.handleInput(input);
            }

            System.out.println("---------------------------------------");
        }

        scanner.close();
        System.out.println("Fin de la demostracion del Patron Command");
    }
}
