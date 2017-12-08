/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.Auto;
import ec.edu.ister.modelo.Test;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 * @Instituto Superior "Tecnologico Rumiñahui"
 * @Programacion Orientada a Objetos II / Aplicaciones Cliente - Servidor
 */
public class Aplicacion {
    public static void main(String[] args) {
        Test test = new Test();
        Auto a = new Auto();
        test.metodo2(a);
        JOptionPane.showMessageDialog(null, "La marca es:"+a.nombre);
    }
}
