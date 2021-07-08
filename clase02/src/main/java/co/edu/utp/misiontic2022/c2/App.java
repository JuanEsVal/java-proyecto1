package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        String ficha;
        String color;
        int posInicial;
        int posFinal;

        System.out.print("\nEscriba un nombre para la ficha: ");  
        ficha = sc.nextLine();
        System.out.print("Escriba un color para la ficha: ");  
        color = sc.nextLine();        
        System.out.print("Escriba la posicion Inicial de la ficha: ");        
        posInicial = sc.nextInt();

        Ficha objFicha1 = new Ficha(ficha, color, posInicial);
        System.out.println("--------------------------------");        
        System.out.println("Datos de la ficha: ");
        System.out.println("--------------------------------");        
        System.out.println( objFicha1 );  // --> objFicha1.toString()
        System.out.println("--------------------------------");        

        System.out.print("\nAhora...  Escriba la posicion hacia donde desea mover esta ficha (" + objFicha1.getNombre() + " " + objFicha1.getColor() + ") :");        
        posFinal = sc.nextInt();        
        System.out.println( objFicha1.movimiento(objFicha1.getNombre(), objFicha1.getPosicion(), posFinal) );
        System.out.println( objFicha1.desplazamieto(objFicha1.getNombre(), objFicha1.getColor() , posFinal) );
        System.out.println("--------------------------------");        
        
        objFicha1.setPosicion(posFinal);
        System.out.print("\nAhora...  Escriba la nueva posicion hacia donde desea mover esta ficha (" + objFicha1.getNombre() + " " + objFicha1.getColor() + ") :");        
        posFinal = sc.nextInt();
        System.out.println("--------------------------------");        
        
        System.out.println( objFicha1.movimiento(objFicha1.getNombre(), objFicha1.getPosicion(), posFinal) );
        System.out.println( objFicha1.desplazamieto(objFicha1.getNombre(), objFicha1.getColor() , posFinal) );
        

        System.out.println();        
        System.out.println();
        sc.close();
    }
} 