package Tienda;

import Producto.*;
import Cliente.*;
import Factura.*;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Factura> facturas;

    public Tienda() {
        this.clientes = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void agregarcliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void agregarFactura(Factura factura){
        this.facturas.add(factura);
    }

    public void mostrarTodosClientes(){
        for (Cliente cliente : this.clientes){
            System.out.println(cliente);
        }
    }

    public void mostrarTodosProductos(){
        for (Producto producto : this.productos) {
            System.out.println(producto);
        }
    }

    public void mostrarTodasFacturas(){
        for (Factura factura: this.facturas) {
            System.out.println(factura);
        }
    }
}
