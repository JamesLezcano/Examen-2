
/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
