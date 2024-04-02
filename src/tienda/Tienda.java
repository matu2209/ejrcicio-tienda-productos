package tienda;

import producto.*;
import cliente.*;
import factura.*;
import carrito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Factura> facturas;

    public Tienda() {
        this.clientes = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void agregarCliente(){
        String nombre, apellido,email;
        long dni;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el DNI del usuario");
        dni = lectura.nextLong(); lectura.nextLine();
        System.out.println("Ingrese nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingrese apellido");
        apellido = lectura.nextLine();
        System.out.println("Ingrese email");
        email = lectura.nextLine();

        this.clientes.add(new Cliente(dni,nombre,apellido,email));
    }

    public Cliente buscarCliente(String nombre){
        for (Cliente cliente: this.clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void agregarProducto(){
        Scanner lectura = new Scanner(System.in);
        int opcion;

        /*menu:
        * 1- agregar teclado
        * 2- agregar mouse
        * 3- agregar pantalla
        * 4 - agregar silla
        * 5 - agregar pad*/
        do {
            System.out.println("Menu \n \t1- Agregar teclado\n \t2-Agregar mouse\n \t3-Agregar pantalla\n \t4-Agregar silla\n \t5-Agregar pad\n \t0-Salir");
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    float precio; int cantidad; boolean isMecanico, isNumerico; String marca,nombre;
                    System.out.println("ingrese precio");

                    //precio = Float.parseFloat(lectura.nextLine()); //porque siempre pasas un string vacio?
                    precio = lectura.nextFloat(); lectura.nextLine();
                    System.out.println("ingrese cantidad");
                    cantidad = lectura.nextInt(); lectura.nextLine();
                    System.out.println("Ingrese marca del producto");
                    marca = lectura.nextLine();
                    System.out.println("Ingrese nombre del producto");
                    nombre = lectura.nextLine();
                    System.out.println("Es mecanico true/false");
                    isMecanico = lectura.nextBoolean(); //agregar validacion despues para no romper
                    /*if (lectura.nextBoolean())
                        isMecanico = true;
                    else isMecanico = false;*/
                    System.out.println("Es numerico true/false");
                    /*if (lectura.nextBoolean())
                        isNumerico = true;
                    else isNumerico = false;*/
                    isNumerico = lectura.nextBoolean();
                    this.productos.add(new Teclado(precio,cantidad,nombre,marca,isMecanico,isNumerico));
                    break;
                case 2:
                    boolean isGamer, isIluminado;
                    System.out.println("ingrese precio");
                    precio = lectura.nextFloat(); lectura.nextLine();
                    System.out.println("ingrese cantidad");
                    cantidad = lectura.nextInt(); lectura.nextLine();
                    System.out.println("Ingrese marca del producto");
                    marca = lectura.nextLine();
                    System.out.println("Ingrese nombre del producto");
                    nombre = lectura.nextLine();
                    System.out.println("Es gamer true/false");
                    isGamer = lectura.nextBoolean();
                    /*if (lectura.nextBoolean())
                        isGamer = true;
                    else isGamer = false;*/
                    System.out.println("Es iluminado true/false");
                    isIluminado = lectura.nextBoolean();
                    /*if (lectura.nextBoolean())
                        isIluminado = true;
                    else isIluminado = false;*/
                    this.productos.add(new Mouse(precio,cantidad,nombre,marca,isGamer,isIluminado));
                    break;
                case 3:
                    int pulgadas;
                    System.out.println("ingrese precio");
                    precio = lectura.nextFloat(); lectura.nextLine();
                    System.out.println("ingrese cantidad");
                    cantidad = lectura.nextInt(); lectura.nextLine();
                    System.out.println("Ingrese marca del producto");
                    marca = lectura.nextLine();
                    System.out.println("Ingrese nombre del producto");
                    nombre = lectura.nextLine();
                    System.out.println("ingrese las pulgadas del monitor");
                    pulgadas = lectura.nextInt();
                    this.productos.add(new Pantalla(precio,cantidad,nombre,marca,pulgadas));
                    break;
                case 4:
                    String material;
                    System.out.println("ingrese precio");
                    precio = lectura.nextFloat(); lectura.nextLine();
                    System.out.println("ingrese cantidad");
                    cantidad = lectura.nextInt(); lectura.nextLine();
                    System.out.println("Ingrese marca del producto");
                    marca = lectura.nextLine();
                    System.out.println("Ingrese nombre del producto");
                    nombre = lectura.nextLine();
                    System.out.println("Ingrese el material de la silla");
                    material = lectura.nextLine();
                    this.productos.add(new Silla(precio,cantidad,nombre,marca,material));
                    break;
                case 5:
                    int tamanio;
                    System.out.println("ingrese precio");
                    precio = lectura.nextFloat(); lectura.nextLine();
                    System.out.println("ingrese cantidad");
                    cantidad = lectura.nextInt(); lectura.nextLine();
                    System.out.println("Ingrese marca del producto");
                    marca = lectura.nextLine();
                    System.out.println("Ingrese nombre del producto");
                    nombre = lectura.nextLine();
                    System.out.println("Ingrese el tamanio del pad");
                    tamanio = lectura.nextInt();
                    this.productos.add(new Pad(precio,cantidad,nombre,marca,tamanio));
                    break;
                default:
                    mostrarTodosProductos();
                    break;
            }
        }while (opcion != 0);

    }

    public void agregarFactura(Factura factura){
        this.facturas.add(factura);
    }

    public void gestionTienda(){
        int opcionMenuPrincipal, opcioneMenuCarrito;
        Scanner lecturaDato = new Scanner(System.in);
        do {
            System.out.println("Menu\n \t1-Agregar cliente\n \t2-Agregar productos\n \t3-Nuevo Carrito\n\t0-Salir");
            /*1- agregar cliente
              2- agregar producto
              3- vender---- mostrar productos electronicos // no electronicos --// mostrar usuarios --> buscar el ususario por id -- // mostrar los que tienen stock ---// elegir productos por id!*/
            opcionMenuPrincipal = lecturaDato.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    Carrito carrito = new Carrito();
                    do {
                        mostrarProductosElectronicos();
                        mostrarProductosNoElectronicos();
                        System.out.println("ingrese id del producto");
                        int idProd = lecturaDato.nextInt();
                        lecturaDato.nextLine();
                        System.out.println("Ingrese cantidad productos");
                        int cant = lecturaDato.nextInt();
                        lecturaDato.nextLine();
                        if (buscarProductoPorId(idProd)!= null)
                            carrito.agregarProducto(buscarProductoPorId(idProd),cant);
                        else
                            System.out.println("Ingreso un id no valido");
                        System.out.println("ingrese 0 para finalizar el carrito");
                        opcioneMenuCarrito = lecturaDato.nextInt();
                        lecturaDato.nextLine();
                    }while (opcioneMenuCarrito!=0);
                    //carrito.mostrarCarrito();
                    mostrarTodosClientes();
                    System.out.println("Para finalizar la compra ingrese el nombre del cliente");
                    Cliente cliente = buscarCliente(lecturaDato.nextLine());//podria ser un while hasta que encuentre el cliente
                    if (cliente!=null){
                        Factura factura = new Factura(cliente,carrito);
                        factura.impirmirFactura();
                        agregarFactura(factura);
                    }
                    else
                        System.out.println("Cliente no encontrado");
                    break;
                default:
            }

        } while (opcionMenuPrincipal != 0);
    }

    public void mostrarTodosClientes(){
        System.out.printf("%5s %10s %15s %15s %25s\n","ID","DNI","NOMBRE","APELLIDO","EMAIL");
        for (Cliente cliente : this.clientes){

            cliente.mostrarCliente();
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

    public void mostrarProductosElectronicos(){
        System.out.println("Productos electronicos");
        System.out.printf("%5s %20s %10s %5s %10s %20s\n","ID","NOMBRE PRODUCTO","PRECIO","CANT","MARCA","ESPECIFICACIONES");
        for (Producto producto: this.productos){
            if (producto instanceof Electronico && producto.getCantidad()>0) {
                producto.mostrarProducto();
            }
        }
    }

    public void mostrarProductosNoElectronicos(){
        System.out.println("Productos no electronicos");
        System.out.printf("%5s %20s %10s %5s %10s %20s\n","ID","NOMBRE PRODUCTO","PRECIO","CANT","MARCA","ESPECIFICACIONES");
        for (Producto producto:this.productos){
            if (producto instanceof Noelectrinico && producto.getCantidad()>0) {
                producto.mostrarProducto();
            }
        }
    }
    public void vender(){ //ahora seria buscarProducto-> mandar producto y cantidad al carrito --> carrito valida y queda a la espera de mas items
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = lectura.nextLine();
        Cliente cliente = buscarCliente(nombre);
        /*Factura factura = new Factura(cliente);
        do{
            System.out.println("Ingrese el Id del producto");
            opcion = lectura.nextInt(); lectura.nextLine();///me quede por aca
            //if (buscarProductoPorId(opcion))
                //factura.agregarProducto(this.productos.get(opcion-1));
        }
        while (opcion!=0);
    System.out.println(factura);*/
    }
    public Producto buscarProductoPorId(int id){

        for (Producto producto:this.productos){
            if (producto.getId() == id)
                return producto;
        }
        return null;
    }
}
