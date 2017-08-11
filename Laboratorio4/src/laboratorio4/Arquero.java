package laboratorio4;

import java.awt.Color;

public class Arquero extends Pieza {

    public Arquero() {
    }

    public Arquero(Color color, String material, int x, int y) {
        super(color, material, x, y);
    }

    @Override
    public int[][] movimiento(Pieza[][] tablero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pieza [][] comer(Pieza [][] tablero){
        int q=x;
        int w=y;
        
        
        return tablero;
    }
    
}
