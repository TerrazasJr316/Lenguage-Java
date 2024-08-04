public class ab_variables {

    public static void main(String[] args) {

        // String (cadenas de texto)
        String saludar = "Hola mundo desde Java";

        // Númericos
        byte numero = 10;
        int numero2 = 5;

        // boolean
        boolean valor = true;

        System.out.println(saludar);

        // Primitivos Números enteros

        byte numeroByte = 7;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bite a " + Short.BYTES);
        System.out.println("tipo short corresponde en bite a " + Short.SIZE);
        System.out.println("valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo short corresponde en bite a " +Integer.BYTES);
        System.out.println("tipo short corresponde en bite a " + Integer.SIZE);
        System.out.println("valor máximo de un short " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un short " + Integer.MIN_VALUE);


    }
}
