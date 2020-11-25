
/**
 * Write a description of class Polinomio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
    private String nombre, carnet;
    private Notas notas;
    
    public Estudiante(String nombre, String carnet,Notas notas)
    {
        this.nombre=nombre;
        this.carnet=carnet;
        this.notas=notas;
    }
    
    public String toString()
    {
        return "  nombre"+getNombre()+"  carnet  "+getCarnet()+"  notas"+getNotas();
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre=nombre;
    }
    
    public String getCarnet()
    {
        return carnet;
    }
    
    public void setCarnet(String carnet)
    {
        this.carnet=carnet;
    }
    
    public Notas getNotas()
    {
        return notas;
    }
    
    public void setNotas(Notas notas)
    {
        this.notas=notas;
    }
}
