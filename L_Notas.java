
/**
 * Write a description of class L_Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L_Notas
{
    private Nota inicio;
    private Nota fin;
   
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
    
    public void insertar(Nota nota)
    {
        Nota actual;
        if (listVacia( ))
        {
            actual= nota;
            inicio=actual;
            fin=actual;
        }
        
        else
        {
            actual= nota;
            fin.setSiguiente(nota);
            fin=actual;
        }
    }
    
    public float obtener (){
        float resultado=0;
        int contador=0;
        Nota aux=inicio;
        while(aux!=null){
            contador++;
            resultado+=aux.getNotas();
            aux=aux.getSiguiente();
        }
        return (resultado/contador);
    }
}
