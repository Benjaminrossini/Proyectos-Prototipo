package objetos;

public class proveedor {
    private int idpreventista;
    private String nombre;
    
    public proveedor(){
        
    }
    public proveedor(int idpreventista,String nombre){
     this.idpreventista = idpreventista;
     this.nombre = nombre;
    }
    public int getIdpreventista() {
        return idpreventista;
    }

    public void setIdpreventista(int idpreventista) {
        this.idpreventista = idpreventista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return idpreventista + "-" + nombre;
    }
}
