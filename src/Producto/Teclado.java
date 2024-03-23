package Producto;

public class Teclado extends Electronico{

    private boolean mecanico;
    private boolean numerico;

    public Teclado(float precio, int cantidad, String nombre, String marca, boolean mecanico, boolean numerico) {
        super(precio, cantidad, nombre, marca);
        this.mecanico = mecanico;
        this.numerico = numerico;
    }

    public boolean isMecanico() {
        return mecanico;
    }

    public void setMecanico(boolean mecanico) {
        this.mecanico = mecanico;
    }

    public boolean isNumerico() {
        return numerico;
    }

    public void setNumerico(boolean numerico) {
        this.numerico = numerico;
    }

    @Override
    public String toString() {
        return
                super.toString() + "mecanico=" + mecanico +
                ", numerico=" + numerico;
    }
}
