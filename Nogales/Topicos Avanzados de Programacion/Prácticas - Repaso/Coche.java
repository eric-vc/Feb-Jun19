public class Coche {
    private String color;
    private int velocidad;
    private float tamaño;

    public Coche (String color, int velocidad, float tamaño){
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
    }

    public void avanzar(){}
    public void parar(){}
    public void girarIzquierda(){}
    public void girarDerecha(){}
}

public static void main (String[] args){
    Coche miCoche = new Coche ("verde", 80, 3.2f);
    Coche tuCoche = new Coche ("rojo", 120, 4.1f);
    Coche suCoche = new Coche ("amarillo", 100, 3.4f);
}