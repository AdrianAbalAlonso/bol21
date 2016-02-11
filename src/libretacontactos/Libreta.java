
package libretacontactos;
import javax.swing.JOptionPane;
/**
 * el destino de esta clase añade contactos , lista , crea grupos , agrega grupos y elimina contactos.
 * @author aabalalonso
 */
public class Libreta {
    //private String nombre;
    //private String dni;
    private final Contacto[] contactos=new Contacto[10];
    private final Grupo[] grupos = new Grupo[10];
    
    /**
     *
     */
    public Libreta(){
       
    }
    
    /**
     * debes meter por pantalla el contacto
     * @param contacto
     */
    public void engadir(Contacto contacto){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     * sirve para añadir un objeto contacto al array contactos 
     */
    public void engadir(){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                Contacto contacto = new Contacto(JOptionPane.showInputDialog("Nombre:"),JOptionPane.showInputDialog("Apellidos:"));
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     *
     */
    public void listar(){
        String cadena="";
        for(Contacto elemento:contactos){
            if(elemento!=null){
                cadena+=elemento.toString()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    /**
     *
     */
    public void eliminar(){
        boolean notFound = true;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que desea borrar:"));
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    contactos[i]=null;
                    notFound=false;
                    break;
                }
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
    }
    
    /**
     *
     */
    public void crearGrupo(){
        boolean grupoLleno = true;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del grupo");
        Grupo grupo = new Grupo(nombre);
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]==null){
                grupos[i]=grupo;
                grupoLleno=false;
                break;
            }
        }
        if(grupoLleno){
            JOptionPane.showMessageDialog(null, "Límite de grupos alcanzado");
        }
    }
    
    /**
     *
     */
    public void agregarAGrupo(){
        boolean contactoEncontrado = false ,grupoEncontrado = false;
        int indiceContactos = 0, indiceGrupos=0;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que quiere guardar en el grupo:"));
        String nombreGrupo = JOptionPane.showInputDialog("Nombre del grupo en el que quiere guardar el contacto:");
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    indiceContactos=i;
                    contactoEncontrado=true;
                    break;
                }
            }
        }
        
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]!=null){
                if(grupos[i].getNombre().equalsIgnoreCase(nombreGrupo)){
                    indiceGrupos=i;
                    grupoEncontrado=true;
                    break;
                }
            }
        }
        
        if(contactoEncontrado && grupoEncontrado){
            contactos[indiceContactos].setGrupo(grupos[indiceGrupos]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Contacto o grupo no encontrado");
        }
    }
}
