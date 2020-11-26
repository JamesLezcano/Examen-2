
/**
 * 
 * En esta clase se la clase Nodo que es necesaria para las demás clases
 * @author (James araya)
 * @version (000)
 */
public class Nodo
{
    private Nodo siguiente;
    private Estudiante dato;
    
    public Nodo(Estudiante dato, Nodo siguiente)
    {
        this.siguiente = siguiente;
        this.dato = dato;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    
    public Estudiante getDato()
    {
        return dato;
    }
    
    public void setDato(Estudiante dato)
    {
        this.dato = dato;
    }
}
