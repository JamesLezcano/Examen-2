import javax.swing.JOptionPane;
/**
 * Esta clase es la lista de los datos que almacena cada estudiante
 * 
 * @author (james) 
 * @version (0000)
 */
public class Grupo
{
    private Nodo inicio;
    private Nodo fin;
   
    public Grupo()
    {
        inicio= null;
        fin=null;
    }
    
    public boolean listVacia()
    {
        if (inicio==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void insertar(Estudiante dato)
    {
        Nodo actual;
        if (listVacia( ))
        {
            actual= new Nodo(dato,null);
            inicio=actual;
            fin=actual;
        }
        else
        {
            actual=new Nodo(dato, null); 
            fin.setSiguiente(actual);
            fin=actual;
        }
    }
    
    public void mostrar()
    {
        if(listVacia())
        {
            System.out.print("lista Vacia");
            return;
        }
        else
        {
            Nodo temporal;
            temporal=inicio;
            while(temporal!=null)
            {
                JOptionPane.showMessageDialog(null,temporal.getDato().toString());
                temporal=temporal.getSiguiente();
            }
        }
    }
}


