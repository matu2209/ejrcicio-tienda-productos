package Carrito;
import Producto.*;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Items> carrito;

    public Carrito() {
        this.carrito = new ArrayList<Items>();
    }

    public String agregarProducto(Producto producto, int cantidad){
        if (producto.getCantidad()<=0 || cantidad > producto.getCantidad())
            return ("No hay stock del producto seleccionado");
        if (buscarProducto(producto)!=-1){
            carrito.get(buscarProducto(producto)).setCantidad(cantidad);
        } else
            carrito.add(new Items(producto,cantidad));
        producto.sacarCantidadProducto(cantidad);
        return ("Producto agregado al carrito");
    }

    private int buscarProducto(Producto producto){
        int i=0;
        for(Items item:this.carrito){
            if (item.getProducto().equals(producto))
                return i;
            i++;
        }
        return -1;
    }
    public void mostrarCarrito(){
        //System.out.printf("Producto\t\t\tCantidad\t\t\tPrecio unitario\t\t\tTotal\n");
        System.out.printf("%20s %20s %20S %20s\n","Producto","Cantidad","Precio Unitario","Total");
        for (Items item:this.carrito){
            //System.out.printf("%s\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\n",item.getProducto().getNombre(),item.getCantidad(),item.getProducto().getPrecio(),item.getSubTotal());
            System.out.printf("%20s %20d %20.2f %20.2f\n",item.getProducto().getNombre(),item.getCantidad(),item.getProducto().getPrecio(),item.getSubTotal());
        }
    }

    public float getTotal(){
        float total = (float) this.carrito.stream().mapToDouble(Items::getSubTotal).sum();
        return total;
    }
}
