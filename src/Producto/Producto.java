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

    public void cambiar(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad) {//agrega cantidad a lo que hay en stock
        this.cantidad += cantidad;
    }

    public void restarProducto(){//valida que haya stock
        if (this.cantidad == 0)
            System.out.println("No hay stock del producto elegido!");
        else
            this.cantidad--;
    }

    public void restarProducto(){//valida que haya stock
        if (this.cantidad == 0)
            System.out.println("No hay stock del producto elegido!");
        else
            this.cantidad--;
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
