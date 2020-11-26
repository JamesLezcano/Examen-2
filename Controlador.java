import javax.swing.JOptionPane;
/**
 * Esta clase se encarga de inicializar el programa 
 * 
 * @author (James Araya) 
 * @version (a version number or a date)
 */
public class Controlador
{
    public static void main()
    {
        Vista vista=new Vista();
        Grupo lista=new Grupo();
        L_Notas notas= new L_Notas();
         
        int opcion;
        
        String nombre , carnet; // instancia los datos que se pasaran a las listas
        float promedio;//instancia las notas que recibira la lista dentro del nodo
        
        float calificacion;
        
        do
        {
            opcion=vista.Menu();
            switch(opcion)
            {
                case 1:
                    
                    nombre= vista.Nombre();
                    carnet = vista.Carnet();
                   
                    for (int y=0 ;y<3; y++)
                    {
                        calificacion=vista.Calificacion();
                        
                        Nota nuevaNota=new Nota(calificacion);
                        notas.insertar(nuevaNota);
                        
                    }
                    promedio = notas.calculo ();
                    lista.insertar(new Estudiante(nombre,carnet,notas, promedio));
                    break;
                    
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    opcion=3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingreso un dato no valido");
            }
        }
        while(opcion!=3);
        
        
    }
}
