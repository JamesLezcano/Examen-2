
/**
 * Write a description of class L_Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L_Notas
{
    private Nodo2 inicio;
    private Nodo2 fin;
   
    public L_Notas()
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
    
    public void insertar(Notas nota)
    {
        Nodo2 actual;
        if (listVacia( ))
        {
            actual= new Nodo2(nota,null);
            inicio=actual;
            fin=actual;
        }
        else
        {
            actual=new Nodo2(nota, null); 
            fin.setSiguiente(actual);
            fin=actual;
        }
    }
}
