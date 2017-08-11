package laboratorio4;

import java.awt.Color;

public class Rey extends Pieza {

    public Rey() {
        super();
    }

    public Rey(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero{
        return tablero;
    }

    @Override
    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }
    @Override
    public String toString() {
        return "R";
    }
}
