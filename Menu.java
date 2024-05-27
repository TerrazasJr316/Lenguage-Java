package com.mycompany.unidad5;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Menu {
    public static void main (String[] args){
        byte op;
        
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(
                "Elige el programa que quieres correr: \n 1.- Tercera Parte de un numero. \n 2.- Carrera TESJI.A\n 3.- Cafeteria TESJI \n 4.- Compra de vestidos. \n 5.- Promedio de edades.\n 6.- Calcula el factorial. \n 7.- Arbol de navidad.\n 8.- Promedio de la materia Fundamentos de programacion. \n 9.- Multiplicacion de forma inversa.\n 10.- Promedio de materias y semestral."));
            switch (op) {
                case 1:
                    TerceraParte1 tp = new TerceraParte1 ();
                    System.out.println (tp.calularTercera());
                break;
                case 2:
                    Carrera2 pun = new Carrera2 ();
                    pun.creditosCarrera();
                break;
                case 3:
                    CafeteriaTesji3 sor = new CafeteriaTesji3 ();
                    sor.sorteoCafe();
                break;
                case 4:
                    VestidosSwitch vt= new VestidosSwitch ();
                    JOptionPane.showMessageDialog(null,"Tu total a pagar sera de: $" + vt.compraVestidos());
                break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Prolematica innovada: \nEn este programa se calcula el promedio \nde edades de 3 personas \nel promedio de estas edades es:");
                    PromedioEdades5 prom = new PromedioEdades5 ();
                    System.out.println(prom.edadesProm(18, 19, 19));
                break;
                case 6:
                    Factorial6 res = new Factorial6 ();
                    JOptionPane.showMessageDialog(null,"El resultado facorial del número introducido es: " + res.calculadoraFac());
                break;
                case 7:
                    Arbol a = new Arbol ();
                    a.arbolMetodo1();
                break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Prolematica innovada: \nEn este programa las calificaciones de Josue \nson las siguientes: 79, 77, 71, 100, 100 se calculo\nel promedio de estos numero:");
                    ArreglosUni $pm = new ArreglosUni ();
                    JOptionPane.showMessageDialog(null,"El resultado del promedio es: " + $pm.promedioMateria(79, 77, 71, 100, 100));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Prolematica innovada: \nEn este programa se insertan 4 valores, 2 veces \ncomo reusltado el utlimo multiplica al primero \n el segundo con el penultimo y asi sucesivamente:");
                    ArreglosUni2 rm = new ArreglosUni2 ();
                    rm.multiplicacionInversa();
                break;
                case 10:
                    ArregloBidi1 ps= new ArregloBidi1 ();
                    ps.promedioSemestre1();
                break;
            
                default: System.out.println("No existe algun programa con este numero");
            }
            op = Byte.parseByte(JOptionPane.showInputDialog("Quieres elegir un programa diferente?\n1 si\n2 no"));
        }
        while (op <= 1);
    }
}