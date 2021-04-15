public class Ejercicio1 {
    public static void main(String[] args){

        /*
         * Ejercicio 1
         *
         * Añade el código necesario para que se muestren
         * todos los valores de las variables
         * (tanto delas conversiones explícitas como las implícitas).
         *
         * Rubén Serrano Cano
         *
         */



        //Variables apartado 1
        double x;
        double y;
        double z;

        //Variables apartado 2
        double num = 3.5;
        char c;

        //Objetos apartado 3
        Byte numByte;
        Short numShort;
        Integer numInt;
        Long numLong;
        Float numFloat;
        Double numDouble;
        String cad = "2";

        //Variables apartado 4
        String cadena = "2";

        //Código apartado 1
        System.out.println("-Apartado 1-");
        x=Math.round(num);    //  x = 4
        System.out.println("Este es el valor de 'x': "+x);
        y=Math.ceil(num);     // y = 4
        System.out.println("Este es el valor de 'y': "+y);
        z=Math.floor(num);    //  z = 3
        System.out.println("Este es el valor de 'z': "+z);
        System.out.println();


        //Código apartado 2
        System.out.println("-Apartado 2-");
        num = (int) 'A';             //num = 65
        System.out.println("Este es el valor de num: "+num);
        c = (char) 65;               // c = ‘A’
        System.out.println("Este es el valor de 'c' : "+c);
        c = (char) ((int) 'A' + 1);  // c = ’B’
        System.out.println("Este es el valor de 'c': "+c);
        System.out.println();

        //Código apartado 3
        System.out.println("-Apartado 3-");
        numByte=Byte.parseByte(cad);
        System.out.println("Este es el valor de numByte: "+numByte);
        numShort=Short.parseShort(cad);
        System.out.println("Este es el valor de numShort: "+numShort);
        numInt=Integer.parseInt(cad);
        System.out.println("Este es el valor de numInt: "+numInt);
        numLong=Long.parseLong(cad);
        System.out.println("Este es el valor de numLong: "+numLong);
        numFloat=Float.parseFloat(cad);
        System.out.println("Este es el valor de numFloat: "+numFloat);
        numDouble=Double.parseDouble(cad);
        System.out.println("Este es el valor de numDouble: "+numDouble);
        System.out.println();

        //Codigo apartado 4
        System.out.println("-Apartado 4-");
        byte n=Byte.parseByte(cadena);
        System.out.println("Este es el valor de n: "+n);
        System.out.println();
    }
}
