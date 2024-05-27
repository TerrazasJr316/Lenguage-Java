package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class VestidosSwitch {
    public long compraVestidos() {
        byte c;
        long m, p;
        p = 0;

        c = Byte.parseByte(JOptionPane.showInputDialog(
                "Selecciona el vestido que quieras: \n 1.- Chico $300 \n 2.- Mediana $400 \n 3.- Grande $500"));

        switch (c) {
            case 1 -> { 
                m = Long.parseLong(JOptionPane.showInputDialog("¿Cuántos quieres?"));
                p = m * 300;
            }
                
            case 2 -> {
                m = Long.parseLong(JOptionPane.showInputDialog("¿Cuántos quieres?"));
                p = m * 400;
            }
                
            case 3 -> {
                m = Long.parseLong(JOptionPane.showInputDialog("¿Cuántos quieres?"));
                p = m * 500;
            }
                
            default -> System.out.println("No hay caso para este número");
        }
        return p;
    }
}