package Factura;
import Cliente.Cliente;
import Producto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static int contId=0;
    private int id;
    private LocalDate fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private float monto;

    public Factura(Cliente cliente, float monto) {
        contId++;
        this.id = contId;
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.monto = monto;
    }

    public void calcularMonto(){
        for (Producto producto : productos){
            this.monto += producto.getPrecio();
        }
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }


}
