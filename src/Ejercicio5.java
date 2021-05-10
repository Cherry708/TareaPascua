import java.io.*;
import java.util.Scanner;

/**
 * Rubén Serrano Cano
 *
 * Haz el ejercicio Un mensaje descifrado que se encuentra en el documento Ejercicios ficheros de la Unidad 7.
 * Almacenando datos en ficheros. Con ese ejercicio, comprobarás las posibilidades de las funciones de entrada y
 * salida de datos de Java en las que harás uso, entre otras, de las libreríascorrespondientes a File, FileReader,
 * BufferedReader, FileWriter, PrintWriter, que se encuentran enel paquete java.io.
 */


public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        //Declaración e inicialización de variables

        int distancia = 2;
        /**
         *
         */
        String path;
        String resultado = "";
        String contenido;

        //Declaración e instanciación de objetos
        Scanner inputUsuario;
        /*
        Objetos para el flujo de entrada de datos
         */
        File ficheroEntrada;
        FileReader lecturaFichero;
        BufferedReader reader;
        Scanner scannerFichero;
        /*
        Objetos para el flujo de salida de datos
         */
        File ficheroSalida;
        FileWriter escrituraFichero;
        PrintWriter writer;

        //Entrada de la ruta del fichero de entrada
        inputUsuario = new Scanner(System.in);
        System.out.println("¿Qué archivo quieres que abra? ");
        path = inputUsuario.nextLine();

        ficheroEntrada = new File(path);
        lecturaFichero = new FileReader(ficheroEntrada);
        reader = new BufferedReader(lecturaFichero);

        ficheroSalida = new File("descifrado.txt");
        escrituraFichero = new FileWriter(ficheroSalida);
        writer = new PrintWriter(escrituraFichero);

        scannerFichero = new Scanner(ficheroEntrada);

        contenido = scannerFichero.nextLine();

        try {
            for (int contador = 0; contador < contenido.length(); contador++) {

                resultado = String.valueOf(contenido.charAt(distancia));
                distancia = distancia + 3;
                writer.print(resultado);

            }
        }catch (IndexOutOfBoundsException e){}
        reader.close();
        writer.close();
        System.out.println(resultado);
    }
}
