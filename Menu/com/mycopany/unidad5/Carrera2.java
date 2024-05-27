package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class Carrera2 {

    protected void creditosCarrera() {

        byte cred = 0;
        byte d, t, c, p;
        d = Byte.parseByte(JOptionPane.showInputDialog("Participaste en el desfile:"
                + "(presiona el numero)\n 1 si\n2 no"));
        if (d == 1) {
            cred = (byte) (cred + 1);
            JOptionPane.showMessageDialog(null, "Ganaste 1 credito");
            t = Byte.parseByte(JOptionPane.showInputDialog("A que taller perteneces:"
                    + "(Pon el numero de tu taller)\n1 danza\n2 futbol\n3 basquetbol\n4 voleibol\n5 tea kwon do"));
            if (t == 1) {
                JOptionPane.showMessageDialog(null,"Vendras con uniforme escolar");
            } else if (t == 2) {
                JOptionPane.showMessageDialog(null," Vendras vestido de verde");
            } else if (t == 3) {
                JOptionPane.showMessageDialog(null,"Vendras de blanco");
            } else if (t == 4) {
                JOptionPane.showMessageDialog(null,"Vendra de rojo");
            } else {
                JOptionPane.showMessageDialog(null,"Vendras con uniforme");
            }
        }
        c = Byte.parseByte(JOptionPane.showInputDialog("Participaste en la carrera:"
                + "(presiona el numero)\n 1 si\n2 no"));

        if (c == 1) {
            cred = (byte) (cred + 1);
            p = Byte.parseByte(JOptionPane.showInputDialog(
                    "En que lugar quedaste:(presiona el número de tu posición)"
                            + "\n1 primer lugar\n2 segundo lugar\n3 tercer lugar"));
            if ((p == 1) || (p == 2) || (p == 3)) {
                cred = (byte) (cred + 1);
            }
        }
        JOptionPane.showMessageDialog(null, "Acumulaste " + cred + " creditos");
    }
}