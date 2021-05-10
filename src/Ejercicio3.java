import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){


        /*
         * Ejercicio 3
         *
         * Haz el ejercicio Sumar valores con un bucle for,
         * que se encuentra en el documento:
         * Ejercicios bucle for de la Unidad 4.
         * Uso de estructuras de control.
         *
         * Rubén Serrano Cano
         *
         */

        //Declaración e instanciación de variables
        boolean ejecucion = true;

        int numero;
        int suma = 0;

        //Declaración e inicialización de objetos
        String entrada;
        Scanner inputUsuario = new Scanner(System.in);


        while (ejecucion) {
            /*
            El usuario debe introducir un entero al que se le sumarán los anteriores
            para mostrar el resultado
             */
            System.out.println("Introduce un número entero: ");
            entrada = inputUsuario.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                System.out.println("El número es: "+numero);
                System.out.println();

                for (int contador = 1; contador <= numero; contador++){
                    System.out.print(contador+" ");
                    suma = suma+contador;
                }

                System.out.println();
                System.out.println("La suma es: "+suma+".");

                ejecucion = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error de entrada");
            }
        }


    }
}
