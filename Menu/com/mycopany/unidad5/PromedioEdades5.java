package com.mycompany.unidad5;

import javax.swing.JOptionPane;

public class PromedioEdades5 {

    float edadesProm (int x, int y, int z) {
        float result;

        result = (float)(18+ 19 + 19)/3;
        JOptionPane.showMessageDialog(null, "El promedio de edades es de: " + result);
        return result;
    }
}
