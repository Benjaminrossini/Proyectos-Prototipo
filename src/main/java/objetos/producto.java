package objetos;

public class producto {
   private int id;
    private String nombre;
    public float Precio;
    

    @Override
    public String toString() {
        return  id + "-" + nombre;
    }

    public producto(){
    
    }
    public producto(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}
