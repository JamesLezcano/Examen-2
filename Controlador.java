
import javax.swing.JOptionPane;
/**
 * se encarga de hacer los llamados a las fiferentes clases y sus metodos
 * 
 * @author (James Araya) 
 * @version (a version number or a date)
 */
public class Controlador
{
    Vista vista =new Vista();
    
    public void controlador()
    {
        int opcion=vista.Menu();
    }
}
    