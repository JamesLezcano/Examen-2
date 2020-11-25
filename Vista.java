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
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("    MENÚ      \nn"
        +" 1 - Insertar datos del estudiante.n"
        +" 2 - Ingresar promedio a evaluar.\n"
        +" 3 - Salir.\n"));
        
        return opcion;
    }
}
