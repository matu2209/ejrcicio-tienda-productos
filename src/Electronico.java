package PRODUCTO;

public class Electronico extends Producto {
    private String marca;


    public Electronico(float precio, int cantidad, String nombre, String marca) {
        super(precio, cantidad, nombre);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
