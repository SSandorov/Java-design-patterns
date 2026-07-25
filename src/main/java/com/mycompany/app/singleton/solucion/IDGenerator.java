package com.mycompany.app.singleton.solucion;

public class IDGenerator {
    private static IDGenerator instance;
    private int currentID;

    //* Definimos un constructor privado para que no se genere uno publico por defecto
    private IDGenerator() {};

    public static IDGenerator getInstance() {
        if (instance == null) {
            instance = new IDGenerator();
        }

        return instance;
    }

    public int generateID() {
        return  ++currentID;
    }
}
