
package libretacontactos;

import javax.swing.JOptionPane;
/**
 * The fate of the main class objects of the others classes , and call the menu.
 * @author aabalalonso
 */

public class App {

    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        boolean condicion = true;
        do{
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1)Añadir contacto\n2)Listar contactos\n3)Eliminar contacto\n5)Crear grupo\n6)Añadir contacto a grupo\n7)Salir"));
        switch(seleccion){
            case 1:
                libreta.engadir();
                break;
            case 2:
                libreta.listar();
                break;
            case 3:
                libreta.eliminar();
                break;
            case 5:
                libreta.crearGrupo();
                break;
            case 6:
                libreta.agregarAGrupo();
                break;
            case 7:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Introduce algún valor ");
        }
        }while(condicion);
        
        
    }
    
}
