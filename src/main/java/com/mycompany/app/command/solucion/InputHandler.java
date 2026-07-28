package com.mycompany.app.command.solucion;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InputHandler {
    private Map<String, Command> commands = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void bind(String key, Command command) {
        commands.put(key, command);
    }

    public void handleInput(String input) {
        Command command = commands.get(input);

        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("El comando no es reconocido");
        }
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            System.out.println("InputHandler: Deshaciendo accion - " + lastCommand.getClass().getSimpleName());
            lastCommand.undo();
        } else {
            System.out.println("El historial esta vacio, no hay acciones para deshacer");
        }
    }

}
