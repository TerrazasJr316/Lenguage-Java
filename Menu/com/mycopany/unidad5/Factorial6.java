package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class Factorial6 {
    public long calculadoraFac (){
        byte num, i;
        long con;
        
        num = Byte.parseByte(JOptionPane.showInputDialog("Introduce un número que quieras saber su facorial:"));
        con = 1;
        
	for (i=num;i>=1;i--) {
            
            con = con*i;
	}
        return con;
    }
}