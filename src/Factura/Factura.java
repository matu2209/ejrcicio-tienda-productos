package Factura;
import Cliente.Cliente;
import Producto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Factura {
    private static int contId=0;
    private int id;
    private LocalDate fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private float monto;

    public Factura(Cliente cliente) {
        contId++;
        this.id = contId;
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.monto = 0;
    }

    public void calcularMonto(){
        for (Producto producto : productos){
            this.monto += producto.getPrecio();
        }
    }

    //agregar producto restar stock
    public void agregarProducto(Producto producto){
        producto.restarProducto();
        this.productos.add(producto);
    }

    public float getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", " + cliente +
                ", productos=" + productos.stream().map(producto -> producto.getNombre()).collect(Collectors.toList()) +
                ", monto=" + monto +
                '}';
    }
}
