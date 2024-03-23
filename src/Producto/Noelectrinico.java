package Producto;

public class Noelectrinico extends Producto{
    private String marca;

    public Noelectrinico(float precio, int cantidad, String nombre, String marca) {
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
