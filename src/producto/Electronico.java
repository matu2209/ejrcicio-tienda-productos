package producto;

public class Electronico extends Producto {//agreagar abstrac para no poder crear isntancia de electronica par ano electronica
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

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.printf(" %15s ",this.getMarca());
    }

//    @Override
//    public String toString() {
//        return super.toString() + "Categoria Electronico " +
//                "marca='" + marca + '\''+", ";
//    }
}
