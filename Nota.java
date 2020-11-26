
/**
 * Esta clase almacena las notas
 * 
 * @author (James) 
 * @version (000)
 */
public class Nota
{
    private float nota;
    private Nota siguiente;
    
    public Nota(float nota)
    {
        this.nota=nota;
    }
    
    public float getNotas()
    {
        return nota;
    }
    
    public void setNotas(float notas)
    {
        this.nota=nota;
    }
    
     public Nota getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nota siguiente)
    {
        this.siguiente=siguiente;
    }
}
