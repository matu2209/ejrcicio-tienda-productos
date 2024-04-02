package producto;

public class Mouse extends Electronico{

    private boolean gamer;
    private boolean iluminado;

    public Mouse(float precio, int cantidad, String nombre, String marca, boolean gamer, boolean iluminado) {
        super(precio, cantidad, nombre, marca);
        this.gamer = gamer;
        this.iluminado = iluminado;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.printf("%10s %10s\n",this.isGamer() ? "Gamer, " : "No gamer, ",this.isIluminado() ? "Iluminado" : "sin iluminacion");
    }
//    public String toString() {
//        return super.toString() + "Mouse " +
//                "gamer=" + gamer +
//                ", iluminado=" + iluminado;
//    }
}
