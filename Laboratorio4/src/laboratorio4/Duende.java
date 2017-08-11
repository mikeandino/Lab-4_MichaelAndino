package laboratorio4;

import java.awt.Color;
import java.util.Scanner;

public class Duende extends Pieza{

    public Duende() {
        super();
    }

    public Duende(Color color, String material, int x, int y) throws FueraDelTablero {
        super(color, material, x, y);
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero) throws FueraDelTablero{    
        return tablero;
                try {
            System.out.println("Puedes moverte: ");
            try {
                if (tablero[x-1][y]==null) {
                    System.out.println("1.Arriba");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x][y-1]==null) {
                    System.out.println("2.Izquierda");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x][y+1]==null) {
                    System.out.println("3.Derecha");
                }
            } catch (Exception e) {
            }
            try {
                if (tablero[x+1][y]==null) {
                    System.out.println("4.Abajo");
                }
            } catch (Exception e) {
            }
            System.out.print("Ingrese el numero donde desea moverse: ");
            int opcion = new Scanner(System.in).nextInt();
            while (opcion<1||opcion>4) {
                System.out.print("Numero Invalido: ");
                opcion = new Scanner(System.in).nextInt();
            }
            switch (opcion) {
                case 1:
                    tablero[x-1][y]=tablero[x][y];
                    tablero[x][y]=null;
                    tablero[x-1][y].setX(x-1);
                    break;
                case 2:
                    tablero[x][y-1]=tablero[x][y];
                    tablero[x][y]=null;
                    tablero[x][y-1].setY(y-1);
                    break;
                case 3:
                    tablero[x][y+1]=tablero[x][y];
                    tablero[x][y]=null;
                    tablero[x][y+1].setY(y+1);
                    break;
                case 4:
                    tablero[x-1][y]=tablero[x][y];
                    tablero[x][y]=null;
                    tablero[x-1][y].setX(x-1);
                    break;
            }
        } catch (FueraDelTablero e) {
            System.out.println(e.getMessage());
        }
        return tablero;
    }

    @Override
    public Pieza [][] comer(Pieza [][] tablero){
        
        
        return tablero;
    }
    
}
