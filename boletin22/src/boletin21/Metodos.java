/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Metodos {

    ArrayList<String> arrayListPalabras = new ArrayList<String>();

    public void engadirPalabras() {

        int vueltas = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de palabras que quieres añadir"));
        for (int i = 0; i < vueltas; i++) {
            arrayListPalabras.add(JOptionPane.showInputDialog("Introduce una palabra"));

        }

        JOptionPane.showMessageDialog(null, arrayListPalabras);

    }

    public void engadirPalabrasFichero(String nomeFich) {
        File f = new File(nomeFich);
        PrintWriter s = null;
        try {
            s = new PrintWriter(f);
            for (int i = 0; i < arrayListPalabras.size(); i++) {
                s.println(i + 1 + " " + arrayListPalabras.get(i));
            }
JOptionPane.showMessageDialog(null,"Se ha escrito en el fichero");
        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura"+ex.getMessage());
        }
finally {
            s.close();
        }
    }

    public void ordenarArray() {
        Collections.sort(arrayListPalabras);
        JOptionPane.showMessageDialog(null,arrayListPalabras );
    }
    

    
}
