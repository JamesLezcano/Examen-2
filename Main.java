import javax.swing.JOptionPane;
/**
 * Esta clase se encarga de inicializar el programa 
 * 
 * @author (James Araya) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
        Lista lista=new Lista();
        String nombre , carnet , nota; 
        //4x^2+3x 
        nombre= "Juan";
        carnet ="b70432";
        nota ="xxx";
        
        lista.insertar(new Estudiante(nombre,carnet,nota));
        lista.mostrar();
    }
}
