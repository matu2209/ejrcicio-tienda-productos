package Producto;

public class Producto {

    private static int contId = 0;
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(float precio, int cantidad, String nombre) {
        contId++;
        this.id = contId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad + ", ";
    }
}
