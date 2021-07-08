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
    public String getNombre(){
        return nombre;
    }

    public String getColor(){
        return color;
    }

    public int getPosicion(){
        return posicion;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }

    //Metodos de la clase Ficha
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve desde la posicion " + pInicial + " hasta la posicion " + pFinal;
    }

    public String desplazamieto(){
        return "La ficha se esta moviendo!";
    }

    // El metodo toString es un metodo de la clase Object que cuando esta dentro de la clase permite
    // que sea llamado solamente con llamar el objeto sin necesidad de llamarlo 
    // asi System.out.print(objFicha) sin ser necesario System.out.print(objFicha.toString())
    public String toString(){
        return "Nombre " + nombre + "\nColor " + color + "\nPosicion " + posicion;
    }
}