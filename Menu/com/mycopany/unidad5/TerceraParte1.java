package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class TerceraParte1 {
    
    public float calularTercera () {
            int x , d;
            float p , c;
            x = Integer.parseInt(JOptionPane.showInputDialog("Dime un valor entre 50 y 200"));
            d = x + x;
            p = d / 3;
            c = p / 2;
            JOptionPane.showMessageDialog(null, "La mitad de la tercera parte del doble de " + x + " es: " + c );
        return c;
    }
}