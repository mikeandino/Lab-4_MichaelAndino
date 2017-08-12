package laboratorio4;

import java.awt.Color;

public class Mago extends Pieza {

    public Mago() {
        super();
    }

    public Mago(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) {
        return tablero;
    }

    @Override
    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }

    @Override
    public String toString() {
        return "M";
    }
}
