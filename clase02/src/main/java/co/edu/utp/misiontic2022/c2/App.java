package co.edu.utp.misiontic2022.c2;

public class App
{
    public static void main( String[] args )
    {
        Ficha objFicha1 = new Ficha("caballo", "negro", 3);

        System.out.println( objFicha1 );  // NO requiere  System.out.println( objFicha.toString())
        
        System.out.println( objFicha1.desplazamieto() );
        System.out.println( objFicha1.movimiento(3, 5) );
        System.out.println( "" );
    }
}