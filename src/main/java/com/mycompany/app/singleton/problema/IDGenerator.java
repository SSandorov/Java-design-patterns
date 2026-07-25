package com.mycompany.app.singleton.problema;

public class IDGenerator {
    private int currentID = 0;

    public int generateId() {
        return ++currentID;
    }
}
