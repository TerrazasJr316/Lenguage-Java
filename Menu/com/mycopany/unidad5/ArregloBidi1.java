package com.mycompany.unidad5;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArregloBidi1 {

    void promedioSemestre1(){
        
        byte a, b, Ar1 [][] = new byte [6][5];
        int pf = 0;
        String unidades [] = {" 1", "2", "3", "4", "5"};
        String materias [] = {"Matematicas discretas", "Fundamentos de programacion", "Quimica", "Calculo diferencial",
            "Fundamentos de investigacion", "Desarrollo Sustenatable"};
        
        System.out.println( Arrays.toString(unidades) + " promedio     promedio semestral");

        for (a = 0; a < 6; a++){
            int s = 0;
            for (b = 0; b < 5; b++) {
                Ar1 [a][b] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu calificacion de " + materias [a] +
                        " de la unidad " + unidades [b]));

                s += Ar1[a][b];
                System.out.print(" " + Ar1[a][b]);
            }
            s /= 5;
            pf += s;
            System.out.println("    " + s + "                           " + materias [a]);
        }
        pf /= 6;
        System.out.println ("                                      " + pf);
    }
}
