package carrito;
import producto.*;

public class Items {
    private Producto producto;
    private int cantidad;

    public Items(Producto producto, int cantidad){
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getSubTotal(){
        return (this.cantidad * this.producto.getPrecio());
    }
}
