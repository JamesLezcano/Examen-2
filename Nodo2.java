
/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo2
{
    private Nodo2 siguiente;  
    private Notas valor;
   
    public Nodo2( Notas valor, Nodo2 siguiente)
    {
        this.siguiente = siguiente;
        this.valor = valor;
    }
   
    public Nodo2 getSiguiente()
    {
        return siguiente;
    }
    
     public void setSiguiente(Nodo2 siguiente)
    {
        this.siguiente = siguiente;
    }
    
    public Notas getValor()
    {
        return valor;
    }
    
    public void getValor(Notas valor)
    {
        this.valor = valor;
    }
}
