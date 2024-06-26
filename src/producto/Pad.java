package producto;

public class Pad extends Noelectrinico{

    private int tamano;

    public Pad(float precio, int cantidad, String nombre, String marca, int tamano) {
        super(precio, cantidad, nombre, marca);
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.printf(" tamano pad %5d ",this.getTamano());
    }
//    @Override
//    public String toString() {
//        return super.toString() + "Pad " +
//                "tamano=" + tamano;
//    }
}
