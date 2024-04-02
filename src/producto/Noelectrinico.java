package producto;

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

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.printf(" %15s ",this.getMarca());
    }

//    @Override
//    public String toString() {
//        return super.toString() + "Noelectrinico " +
//                "marca='" + marca + '\'' +
//                " ";
//    }
}
