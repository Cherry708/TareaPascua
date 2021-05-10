public class Ejercicio4 {
    public static void main(String[] args) {
        // declaramos e inicializamos las variables como indica el enunciado
        boolean casado = true;
        int VALOR_MAXIMO = 999999;
        byte diaSemana = 1;
        short diaAnyo = 300;
        char sexo = 'M';
        long miliseg = 1298332800000L;
        float totalFactura = 10350.678f;
        long poblacion = 6775235741L;

        // mostramos en pantalla el resultado del apartado 4 usando la orden println
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("\tEl valor de la variable casado es "+ casado);
        System.out.println("\tEl valor de la variable VALOR_MAXIMO es "+ VALOR_MAXIMO);
        System.out.println("\tEl valor de la variable diaSemana es "+ diaSemana);
        System.out.println("\tEl valor de la variable diaAnyo es "+ diaAnyo);
        System.out.println("\tEl valor de la variable miliseg es "+ miliseg);
        System.out.println("\tEl valor de la variable totalFactura es "+ totalFactura);
        System.out.println("\tEl valor de la variable poblacion es "+ poblacion);
        System.out.println("\tEl valor de la variable sexo es "+ sexo +"\n"); /* añadimos un salto de línea para
         facilitar la lectura del resultado*/

        // mostramos en pantalla el resultado del apartado 4 usando la orden printf
        System.out.print("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----\n"); //añadimos un salto de línea
        System.out.printf("\tEl valor de la variable casado es %b\n", casado);
        System.out.printf("\tEl valor de la variable VALOR_MAXIMO es %d\n", VALOR_MAXIMO);
        System.out.printf("\tEl valor de la variable diaSemana es %d\n", diaSemana);
        System.out.printf("\tEl valor de la variable diaAnyo es %d\n", diaAnyo);
        System.out.printf("\tEl valor de la variable miliseg es %d\n", miliseg);
        System.out.printf("\tEl valor de la variable totalFactura es %f\n", totalFactura);
        System.out.printf("\tEl valor de la variable poblacion es %d\n", poblacion);
        System.out.printf("\tEl valor de la variable sexo es %c\n", sexo);

    }
}
