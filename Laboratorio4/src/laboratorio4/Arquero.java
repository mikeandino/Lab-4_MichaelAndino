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
        try {
            System.out.println("Puedes Moverte");
            try {
                if (tablero[x - 1][y - 1] == null || tablero[x - 1][y - 1].color != tablero[x][y].color) {
                    System.out.println("Puedes Moverte\n"
                            + "1. Arriba\n"
                            + "1. Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x - 2][y - 2] == null || tablero[x - 2][y - 2].color != tablero[x][y].color) {
                    System.out.println("Puedes Moverte\n"
                            + "2. Arriba\n"
                            + "2. Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x - 3][y - 3] == null || tablero[x - 3][y - 3].color != tablero[x][y].color) {
                    System.out.println("Puedes Moverte\n"
                            + "3. Arriba\n"
                            + "3. Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x - 4][y - 4] == null || tablero[x - 4][y - 4].color != tablero[x][y].color) {
                    System.out.println("Puedes Moverte\n"
                            + "4. Arriba\n"
                            + "4. Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x - 5][y - 5] == null || tablero[x - 5][y - 5].color != tablero[x][y].color) {
                    System.out.println("Puedes Moverte\n"
                            + "5. Arriba\n"
                            + "5. Izquierda");
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }

        return tablero;
    }

    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }

    @Override
    public String toString() {
        return "A";
    }

}
