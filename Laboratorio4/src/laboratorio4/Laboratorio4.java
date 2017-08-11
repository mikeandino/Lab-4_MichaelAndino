package laboratorio4;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio4 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugador = new ArrayList();

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
                    Añadir();
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

    public static void Añadir(){
        System.out.println("Ingrese el Nombre del Jugador: ");
        String nombre=sc.next();
        System.out.println("Ingrese el Nombre de Usuario: ");
        String usuario=sc.next();
        int puntuacion=0;
        System.out.println("Ingrese Su Lugar De Nacimiento: ");
        String lugar = sc.next();
        System.out.println("Ingrese su Edad: ");
        int edad=sc.nextInt();
        System.out.println("Ingrese el Sexo [F/M]:" );
        char sexo=sc.next().charAt(0);
        //Recordar Modificar el Color en la Clase
        jugador.add(new Jugador(nombre,usuario,puntuacion,lugar,edad,sexo,null));
        
    }

}
