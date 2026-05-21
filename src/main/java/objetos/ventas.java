package objetos;

public class ventas {
    String prducto;
    float cantidad;
    double precio;
    String dni;
    double preciototal;

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }


    public String getPrducto() {
        return prducto;
    }

    public void setPrducto(String prducto) {
        this.prducto = prducto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return  prducto  + "-" + cantidad + "-" + precio + "-" + dni + "-" + preciototal;
    }
}
