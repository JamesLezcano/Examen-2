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
        L_Notas notas= new L_Notas();
        
       
        //4x^2+3x 
        nombre= "Juan";
        carnet ="b70432";
        
        for (int y=0 ;y<5; y++)
        {
            
            
            Nota nuevaNota=new Nota(10);
            notas.insertar(nuevaNota);
            
        }
        
             System.out.println("\n");
        
        System.out.println(notas.obtener());
        
        System.out.println("\n");
        
        //lista.insertar(new Estudiante(nombre,carnet,notas));
        //lista.mostrar();
    }
}
