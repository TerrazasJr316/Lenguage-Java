package com.mycompany.unidad5;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArreglosUni2 {
    
    public void multiplicacionInversa () {
        
        byte x, y, z, A1 [] = new byte [5], A2 [] = new byte [5], A3 [] = new byte [5];
        String titulos [] = {"0", "1", "2", "3", "4"};

        
        for (x = 0; x < 5; x++) {
            A1 [x] = Byte.parseByte(JOptionPane.showInputDialog("Introduce un número entre 1 y 11 posición " + titulos[x]));
        }
        System.out.println (Arrays.toString(titulos));
        System.out.println (Arrays.toString(A1));
        
        for (y = 0; y < 5; y++) {
            A2 [y] = Byte.parseByte(JOptionPane.showInputDialog("Introduce un número entre 1 y 11 posición " +  titulos[y]));
        }
        System.out.println();
        System.out.println (Arrays.toString(titulos));
        System.out.println (Arrays.toString(A2));
        
        System.out.println();
        System.out.println (Arrays.toString(titulos));
        for (z=0; z < A1.length; z++) {
            A3[z] = (byte)(A1[z] * A2[A2.length-(z+1)]);
        }
        System.out.print (Arrays.toString(A3));
    }
}