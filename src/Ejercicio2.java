import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args){

        /*
         * Ejercicio 2
         *
         * Haz el ejercicio Dos dados más corto,
         * que se encuentra en el documento:
         * Ejercicios bucle do-while de la Unidad 4.
         * Uso de estructuras de control.
         *
         * Rubén Serrano Cano
         *
         */

        //Declaración de variables
        int dado1;
        int dado2;

        //Declaración e instanciación de objetos
        Random aleatorio = new Random();

        do {
            /*
            Debemos incluir la asignación en el bucle de modo que
            se alteren los valores a cada ciclo y el bucle finalice.
             */
            dado1 = aleatorio.nextInt(6)+1;
            dado2 = aleatorio.nextInt(6)+1;

            System.out.println("El dado #1 es: "+dado1);
            System.out.println("El dado #2 es: "+dado2);
            System.out.println("¡El total es: "+(dado1+dado2)+"!");
            System.out.println();

        } while (dado1 != dado2 );
        System.out.println("¡Los dados son iguales!");
    }
}
