import javax.swing.JOptionPane;
/**
 * Se encarga de mostrar al usuario las opciones o los datos con los que se va a intereactuar
 * 
 * @author (James Araya) 
 * @version (a version number or a date)
 */
public class Vista
{
    public int Menu()
    {
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("    MENÚ      \n\n"
        +" 1 - Insertar datos del estudiante.\n"
        +" 2 - Imprimir elementos de la lista estudiante.\n"
        +" 3 - Salir.\n"));
        
        return opcion;
    }
    
    public String Nombre()
    {
         String nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
         return nombre;
    }
    
    public String Carnet()
    {
         String carnet=JOptionPane.showInputDialog("Ingrese el Carnet del estudiante: ");
         return carnet;
    }
    
    public float Calificacion()
    {
        float calificacion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
        return calificacion;
    }
    
     public int elementos()
    {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas va a agregar: "));
        return cantidad;
    }
}
