package co.edu.utp.misiontic2022.c2;

public class Ficha{

    //Atributos de la clase
    private String nombre;
    private String color;
    private int posicion;

    //Constructor
    public Ficha(String nombre, String color, int posicion){
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    } 

    //Metodos de la clase Ficha
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve desde la posicion " + pInicial + " hasta la posicion " + pFinal;
    }

    
    public String movimiento(String ficha, int posInicial, int posFinal){
        return "\nLa ficha (" + ficha + ") se movera desde la posicion " + posInicial + " hasta la posicion " + posFinal + "  ...";
    }

    public String desplazamieto(){
        return "La ficha se ha movido! ";
    }

    public String desplazamieto(String ficha, String color, int posFinal){
        return "\n  ......La ficha (" + ficha + ") de color (" + color + ") se ha movido a la posicion " + posFinal;
    }    

    // El metodo toString es un metodo de la clase Object que cuando esta dentro de la clase permite
    // que sea llamado solamente con llamar el objeto sin necesidad de llamarlo 
    // asi System.out.print(objFicha) sin ser necesario System.out.print(objFicha.toString())
    public String toString(){
        return "Nombre Ficha: " + nombre + "\nColor Ficha: " + color + "\nPosicion Ficha: " + posicion;
    }
}