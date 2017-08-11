package laboratorio4;

import java.awt.Color;

public class Caballero extends Pieza {

    public Caballero() {
        super();
    }

    public Caballero(Color color, String material, int x, int y) {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero {
        try {
            System.out.println("Puedes moverte: ");
            try {
                if (tablero[x][y-1]==null) {
                    System.out.println("1.Arriba");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x-1][y]==null) {
                    System.out.println("2.Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x-1][y]==null) {
                    System.out.println("3.Derecha");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x-1][y]==null) {
                    System.out.println("4.Abajo");
                }
            } catch (Exception e) {
            }
            System.out.print("Ingrese el numero donde desea m");
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
