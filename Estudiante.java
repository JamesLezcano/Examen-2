/**
 * Esta clase almacena los datos que se pasan al usuario 
 * 
 * @author (james Araya) 
 * @version (0000)
 */
public class Estudiante
{
    private String nombre, carnet;
    private L_Notas notas;
    private float promedio;
    
    public Estudiante(String nombre, String carnet,L_Notas notas, float promedio)
    {
        this.nombre=nombre;
        this.carnet=carnet;
        this.notas=notas;
        this.promedio=promedio;
    }
    
    public String toString()
    {
        return "\n  nombre   "+getNombre()+"\n  carnet  "+getCarnet()+ "\n Promedio "+ getPromedio();
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
    
    public L_Notas getNotas()
    {
        return notas;
    }
    
    public void setNotas(L_Notas notas)
    {
        this.notas=notas;
    }
    
    public float getPromedio()
    {
        return promedio;
    }
    
    public void setPromedio(float promedio)
    {
        this.promedio=promedio;
    }
}
