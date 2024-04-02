package Producto;

public class Pantalla extends Electronico{

    private int pulgadas;

    public Pantalla(float precio, int cantidad, String nombre, String marca, int pulgadas) {
        super(precio, cantidad, nombre, marca);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pulgadas=" + pulgadas;
    }
}
