package Factura;
import Cliente.Cliente;
import Producto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Carrito.*;

public class Factura {
    private static int contId=0;
    private int id;
    private LocalDate fecha;
    private Cliente cliente;
    private Carrito carrito;
    private float monto;

    public Factura(Cliente cliente, Carrito carrito) {
        contId++;
        this.id = contId;
        this.fecha = LocalDate.now();
        this.carrito = carrito; //ahora acepta el carrito con los productos agregados y la cantidad de ese producto
        this.cliente = cliente;
        this.monto = carrito.getTotal();
    }

    public void impirmirFactura(){

        System.out.printf("Factura numero %20s Fecha %10s\n", this.id,this.fecha);
        this.carrito.mostrarCarrito();
        System.out.printf("Total %40.2f",this.monto);



    }
    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", " + cliente +
                ", productos=" + carrito +
                ", monto=" + monto +
                '}';
    }
}
