package laboratorio4;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio4 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugador = new ArrayList();

    public static void main(String[] args) {
        Añadir();
        Añadir();
        System.out.println("1. Agregar Jugador\n"
                + "2. Eliminar Jugador\n"
                + "3. Listar Jugadores\n"
                + "4. Jugar\n"
                + "Ingrese la Opcion que desea realizar: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                Añadir();
                main(args);
                break;

            case 2:
                Eliminar();
                main(args);
                break;

            case 3:
                Listar();
                main(args);
                break;

            case 4:
                Jugar();
                break;

        }
    }

    public static void Añadir() {
        System.out.println("Ingrese el Nombre del Jugador: ");
        String nombre = sc.next();
        System.out.println("Ingrese el Nombre de Usuario: ");
        String usuario = sc.next();
        for (Jugador jugador1 : jugador) {
            while (jugador1.Usuario.equals(usuario)) {
                System.out.println("El nombre de usuario ya existe: ");
                usuario = sc.next();
            }
        }
        int puntuacion = 0;
        System.out.println("Ingrese Su Lugar De Nacimiento: ");
        String lugar = sc.next();
        System.out.println("Ingrese su Edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el Sexo [F/M]:");
        char sexo = sc.next().toLowerCase().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Ingrese un character apropiado");
            sexo = sc.next().toLowerCase().charAt(0);
        }
        if (sexo == 'f') {
            sexo = '♀';
        } else {
            sexo = '♂';
        }
        //Recordar Modificar el Color en la Clase
        jugador.add(new Jugador(nombre, usuario, puntuacion, lugar, edad, sexo, null));

    }

    public static void Eliminar() {
        for (Jugador lista : jugador) {
            System.out.print((jugador.indexOf(lista) + 1) + ". " + lista.Nombre);
        }
        System.out.print("Ingrese el numero del jugador a eliminar: ");
        int index = sc.nextInt() - 1;
        jugador.remove(index);
    }

    public static void Listar() {
        for (Jugador lista : jugador) {
            System.out.print((jugador.indexOf(lista) + 1) + ". " + lista.toString());
        }
    }

    private static void Jugar() {
        for (Jugador lista : jugador) {
            System.out.print((jugador.indexOf(lista) + 1) + ". " + lista.Nombre);
        }
        System.out.print("Ingrese el numero del jugador a eliminar: ");
        int numero = sc.nextInt() - 1;
        int numero2 = sc.nextInt() - 1;
        Tablero tabla = new Tablero(jugador.get(numero), jugador.get(numero2));
        tabla.llenarTablero();
        Juego(tabla.getJugador1(), tabla.getJugador2(), tabla.getTablero(), "p1");
    }

    public static void Juego(Jugador jugador1, Jugador jugador2, Pieza[][] tabla, String turno) {
        if (turno.equals("p1")) {

        } else {
            
        }
    }
}
