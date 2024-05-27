package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class CafeteriaTesji3 {

    public void sorteoCafe () {
        byte t, p, t1, t2, t3, e, pv = 1, pa = 2, pr = 3;

        t = Byte.parseByte(JOptionPane.showInputDialog("¿Cuánto pagaras?"));

        p = Byte.parseByte(JOptionPane.showInputDialog("De que color es tu pelota:(presiona el numero, de acuerdo al color de tu pelota)\n 1 verde\n2 amarilla\n3 roja "));

        if (p == pv) {
            t1 = (byte) (t - (t * 0.1));
            JOptionPane.showMessageDialog(null, "Se aplicara el 10% de descuento y pagarás: $" + t1);
        } else if (p == pa) {
            t2 = (byte) (t - (t * 0.05));
            JOptionPane.showMessageDialog(null, "Se aplicara el 5% de descuento y pagarás: $" + t2);
        } else if (p == pr) {
            t3 = (byte) (t - (t * 0.15));
            JOptionPane.showMessageDialog(null, "Se aplicara el 15% de descuento y pagarás: $" + t3);
        }

        e = Byte.parseByte(JOptionPane.showInputDialog("¿Eres estudiante de sistemas?(presiona el número según tu caso)\n1 si\n2 no "));

        if (e == 1) {
            JOptionPane.showMessageDialog(null,"Se te regalara un jugo");
        }
        else {
            JOptionPane.showMessageDialog(null,"No se te regalará nada");
        }
    }
}