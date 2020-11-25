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
        String nombre , carnet;
        LNotas nota=new LNotas();
        
        
        //4x^2+3x 
        nombre= "Juan";
        carnet ="b70432";
        
        
        
        for (int y=0 ; y<=5; y++)
        {
            LNotas notat=new LNotas();
            notat.valor=y; 
            nota.siguiente=nota;
            
        }
        lista.insertar(new Estudiante(nombre,carnet,nota));
        lista.mostrar();
    }
}
