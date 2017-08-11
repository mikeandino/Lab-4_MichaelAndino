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
        try {
            if (tablero[x][y].color.equals(Color.WHITE)) {
                if (true) {
                    
                }
            }
            System.out.println("Puedes moverte: ");
        } catch (FueraDelTablero e) {
            System.out.println(e.getMessage());
        }
        return tablero;
    }

    @Override
    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }

}
