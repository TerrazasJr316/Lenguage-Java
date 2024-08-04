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
        System.out.println("tipo int corresponde en bite a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bite a " + Integer.SIZE);
        System.out.println("valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int " + Integer.MIN_VALUE);

        // Primitivos Números flotantes

        long numeroLong = 9223372036854775807L;

        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bite a " +Long.BYTES);
        System.out.println("tipo long corresponde en bite a " + Long.SIZE);
        System.out.println("valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808F;

        float realFloat = 0.00000000015f; //1-5e-10f

        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bite a " + Float.BYTES);
        System.out.println("tipo float corresponde en bite a " + Float.SIZE);
        System.out.println("valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;

        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en bite a " + Double.BYTES);
        System.out.println("tipo double corresponde en bite a " + Double.SIZE);
        System.out.println("valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double " + Double.MIN_VALUE);

        // Primitivos caracteres

        char simbolo = '@';

        System.out.println("símbolo = " + simbolo);
        System.out.println("tipo char corresponde en bite a " + Character.BYTES);
        System.out.println("tipo char corresponde en bite a " + Character.SIZE);
        System.out.println("valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un double " + Character.MIN_VALUE);

        // Primitivos Boolean

        boolean datoLogico = true;
    }
}
