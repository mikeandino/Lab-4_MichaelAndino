package laboratorio4;

import java.awt.Color;

public class Arquero extends Pieza {

    public Arquero() {
    }

    public Arquero(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero {
        
        
        return tablero;
    }

    public Pieza [][] comer(Pieza [][] tablero){
        
        
        
        return tablero;
    }

    @Override
    public String toString() {
        return "A";
    }
    
}
