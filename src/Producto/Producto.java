package Producto;

import java.util.Objects;

public class Producto {//agregar abstrac para no crear instancias de producto

    private static int contId = 0;
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(float precio, int cantidad, String nombre) {
        contId++;
        this.id = contId;
        this.nombre = nombre;
        if (precio>0)
            this.precio = precio;
        else
            this.precio = 1000;
        if (cantidad>0)
            this.cantidad = cantidad;
        else
            this.cantidad=0;

    }
    //agregar validaciones de para stock y precio!
    public float getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
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

    public void sacarCantidadProducto(int resto){//valida que haya stock
        if (this.cantidad == 0)
            System.out.println("No hay stock del producto elegido!");
        else
            this.cantidad-=resto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad + ", ";
    }
}
