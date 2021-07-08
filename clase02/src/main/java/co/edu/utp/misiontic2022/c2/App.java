package co.edu.utp.misiontic2022.c2;

public class App
{
    public static void main( String[] args )
    {
        Ficha objFicha1 = new Ficha("caballo", "negro", 3);
        Ficha objFicha2 = new Ficha("alfil", "blanco", 8);

        objFicha1.setNombre("Reina");
        objFicha2.setNombre("Torre");


        System.out.println();
        System.out.println( objFicha1 );  // NO requiere  System.out.println( objFicha.toString())
        System.out.println();
        System.out.println( objFicha1 );  // NO requiere  System.out.println( objFicha.toString())
        System.out.println();
                
        System.out.println( objFicha1.desplazamieto() );
        System.out.println( objFicha1.movimiento(3, 5) );

        System.out.println();
        
        System.out.println( objFicha2.desplazamieto(objFicha2.getNombre()) );
        System.out.println( objFicha2.movimiento( 6, 2, objFicha2.getNombre() ) );
        
        System.out.println();
    }
} 