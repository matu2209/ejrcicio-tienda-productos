package producto;

public class Silla extends Noelectrinico{

    private String material;

    public Silla(float precio, int cantidad, String nombre, String marca, String material) {
        super(precio, cantidad, nombre, marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.printf(" %5s ",this.getMaterial());
    }

//    @Override
//    public String toString() {
//        return  super.toString()+"Silla " +
//                "material='" + material + '\'';
//    }
}
