package objetos;

public class idventa {
    private int id;
    private String idventa;
    public idventa(){
    }
    public idventa(int id,String idventa){
        this.id=id;
        this.idventa=idventa;
    }
    @Override
    public String toString() {
        return  id +"-" + "venta numero "+idventa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }
}
