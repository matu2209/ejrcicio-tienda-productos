package Carrito;
import Producto.*;
import java.util.ArrayList;

public class Carrito {

    private ArrayList<Items> carrito;

    public Carrito(ArrayList<Items> carrito) {
        this.carrito = new ArrayList<Items>();
    }

    public String agregarProducto(Producto producto, int cantidad){
        if (producto.getCantidad()<=0)
            return ("No hay stock del producto seleccionado");
        Items item = new Items(producto,cantidad);
        return ("Producto agregado al carrito");
    }

    public void mostrarCarrito(){
        for (Items item:this.carrito){
            System.out.printf("\tProducto %s,cantidad: %d, precio: %f\n",item.getProducto().getNombre(),item.getProducto().getPrecio());
        }
    }

    public float getTotal(){
        float total = (float) this.carrito.stream().mapToDouble(Items::getSubTotal).sum();
        return total;
    }
}
