package laboratorio4;

import java.awt.Color;

public class Duende extends Pieza{

    public Duende() {
        super();
    }

    public Duende(Color color, String material, int x, int y) {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero{    
        return tablero;
    }

    @Override
    public Pieza [][] comer(Pieza [][] tablero){
        
        
        return tablero;
    }
    
}
