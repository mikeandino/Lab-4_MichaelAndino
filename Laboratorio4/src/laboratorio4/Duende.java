package laboratorio4;

import java.awt.Color;
import java.util.Scanner;

public class Duende extends Pieza {

    public Duende() {
        super();
    }

    public Duende(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero {
        if (tablero[x][y].color==Color.WHITE) {
            if (tablero[x-1][y]==null) {
                    tablero[x-1][y]=tablero[x][y];
                    tablero[x][y]=null;
            }else{
                System.out.println("No se puede mover");
            }
        }else{
            if (tablero[x+1][y]==null) {
                    tablero[x+1][y]=tablero[x][y];
                    tablero[x][y]=null;
            }else{
                System.out.println("No se puede mover");
            }
        }
        return tablero;
    }
    

    @Override
    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }

    @Override
    public String toString() {
        return "D";
    }
}
