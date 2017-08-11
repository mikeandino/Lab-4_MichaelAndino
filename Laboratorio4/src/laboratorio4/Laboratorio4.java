package laboratorio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio4 {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Jugador> jugador = new ArrayList();

    public static void main(String[] args) {
        String resp = "s";
        while ("s".equals(resp) || "S".equals(resp)) {
            System.out.println("1. Agregar Jugador\n"
                    + "2. Eliminar Jugador\n"
                    + "3. Listar Jugadores\n"
                    + "4. Jugar"
                    + "Ingrese la Opcion que desea realizar: ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

            }
        }
    }
}
