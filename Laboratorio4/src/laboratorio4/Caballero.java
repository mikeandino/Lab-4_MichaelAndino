package laboratorio4;

import java.awt.Color;
import java.util.Scanner;

public class Caballero extends Pieza {

    public Caballero() {
        super();
    }

    public Caballero(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) {
        System.out.println("Puedes moverte: ");
        try {
            if (tablero[x - 1][y] == null || tablero[x - 1][y].color != tablero[x][y].color) {
                System.out.println("1.Arriba");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x - 1][y - 1].color != tablero[x][y].color) {
                System.out.println("2.Arriba-Izquierda");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x][y - 1] == null || tablero[x][y - 1].color != tablero[x][y].color) {
                System.out.println("3.Izquierda");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x + 1][y - 1] == null || tablero[x][y - 1].color != tablero[x][y].color) {
                System.out.println("4.Abajo-Izquierda");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x - 1][y + 1].color != tablero[x][y].color) {
                System.out.println("5.Arriba-Derecha");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x][y + 1] == null || tablero[x - 1][y].color != tablero[x][y].color) {
                System.out.println("6.Derecha");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x][y + 1] == null || tablero[x - 1][y].color != tablero[x][y].color) {
                System.out.println("7.Abajo-Derecha");
            }
        } catch (Exception e) {
        }
        try {
            if (tablero[x + 1][y] == null || tablero[x - 1][y].color != tablero[x][y].color) {
                System.out.println("8.Abajo");
            }
        } catch (Exception e) {
        }
        System.out.print("Ingrese el numero donde desea moverse: ");
        int opcion = new Scanner(System.in).nextInt();
        while (opcion < 1 || opcion > 8) {
            System.out.print("Numero Invalido: ");
            opcion = new Scanner(System.in).nextInt();
        }
        switch (opcion) {
            case 1:
                try {
                    if (tablero[x - 1][y]==null) {
                        tablero[x - 1][y] = tablero[x][y];
                        tablero[x][y] = null;
                        tablero[x - 1][y].setX(x - 1);
                    } else {
                        tablero = comer(tablero);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
                break;
            case 3:
                try {
                    if (tablero[x - 1][y] == null) {
                        tablero[x - 1][y] = tablero[x][y];
                        tablero[x][y] = null;
                        tablero[x - 1][y].setX(x - 1);
                    } else {
                        tablero = comer(tablero);
                    }
                } catch (FueraDelTablero e) {
                    e.getMessage();
                }
                break;
            case 6:
                try {
                    if (tablero[x - 1][y].equals(null)) {
                        tablero[x - 1][y] = tablero[x][y];
                        tablero[x][y] = null;
                        tablero[x - 1][y].setX(x - 1);
                    } else {
                        tablero = comer(tablero);
                    }
                } catch (FueraDelTablero e) {
                    e.getMessage();
                }
            case 8:
                try {
                    if (tablero[x - 1][y]==null) {
                        tablero[x - 1][y] = tablero[x][y];
                        tablero[x][y] = null;
                        tablero[x - 1][y].setX(x - 1);
                    } else {
                        tablero = comer(tablero);
                    }
                } catch (FueraDelTablero e) {
                    e.getMessage();
                }
            default:
                System.out.println("Opcion Invalida");
                opcion = new Scanner(System.in).nextInt();
                break;
        }
        return tablero;
    }

    @Override
    public Pieza[][] comer(Pieza[][] tablero) {

        return tablero;
    }

}
