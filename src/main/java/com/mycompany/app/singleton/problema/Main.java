package com.mycompany.app.singleton.problema;

public class Main {
    public static void main(String[] args) {
        IDGenerator gen1 = new IDGenerator();
        // IDGenerator gen2 = new IDGenerator();

        //* Con la inyeccion de dependencias no solucionamos el problema, ya que la instancia de la clase
        //* gen1 no podemos pasarla a otros sitios 
        Player player = new Player(gen1);
        Enemy enemy = new Enemy(gen1);


        player.showId();
        enemy.showId();

    }
}
