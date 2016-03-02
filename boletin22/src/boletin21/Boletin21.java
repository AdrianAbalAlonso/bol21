/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos obx = new Metodos();
        boolean condicion = true;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1)Engada palabras.\n"
                    + "2)Escribir en el fichero.\n3)Ordenar palabras\n4)Salir"));
            switch (opcion) {
                case 1:
                    obx.engadirPalabras();
                    break;
                case 2:
                    obx.engadirPalabrasFichero("src/boletin22/palabras.txt");
                    break;
                case 3:
                    obx.ordenarArray();
                    break;
                case 4:condicion=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduzca una opción válida.");
            }
        } while (condicion);

    }

}
