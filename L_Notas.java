
/**
 * esta clase almacena la lista de notas
 * 
 * @author (james) 
 * @version (0000)
 */
public class L_Notas
{
    private Nota inicio;
    private Nota fin;
    public float resultado=0;
    public int contador=0;
   
    public L_Notas()
    {
        inicio= null;
        fin=null;
    }
    
    /**
     * @param recibe un valor booleano que indica si la lista esta vacia o posee elementos
     */
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
    
    /**
     * @param recibe la nota para almacenarla en un nodo
     */
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
    
    /**
     * @return retorna el promedio de las notas de una lista
     */
    public float calculo (){
        float resultado=0;
        int contador=0;
        Nota aux=inicio;
        while(aux!=null){
            contador++;
            resultado+=aux.getNotas();
            aux=aux.getSiguiente();
        }
        float promedio=(resultado/contador);
        return promedio;
    }
}
