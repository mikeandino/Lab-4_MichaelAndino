package laboratorio4;


import java.awt.Color;

public abstract class Pieza {
    
    protected Color color;
    protected String material;
    protected int x;
    protected int y;
    
    public Pieza() {
    }

    public Pieza(Color color, String material, int x, int y) {
        this.color = color;
        this.material = material;
        this.x = x;
        this.y = y;
    }

    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", material=" + material + ", x=" + x + ", y=" + y + '}';
    }

    public abstract Pieza [][] movimiento(Pieza [][] tablero);
        
    
    
    public Pieza [][] comer(Pieza [][] tablero){
        return tablero;
    }
    
}