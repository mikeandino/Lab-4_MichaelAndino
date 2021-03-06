package laboratorio4;

import java.awt.Color;

public class Jugador {
    protected String Nombre;
    protected String Usuario;
    protected int Puntuacion;
    protected String Lugar;
    protected int Edad;
    protected char Sexo;
    protected Color color;

    public Jugador() {
    }

    public Jugador(String Nombre, String Usuario, int Puntuacion, String Lugar, int Edad, char Sexo, Color color) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Puntuacion = Puntuacion;
        this.Lugar = Lugar;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.color = color;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return Nombre
                + "\n     Usuario: " + Usuario
                + "\n     Puntuacion: " + Puntuacion
                + "\n     Lugar de Nacimiento: " + Lugar
                + "\n     Edad: " + Edad
                + "\n     Sexo: " + Sexo
                + "\n     Color: " + color + "\n";
    }
}
