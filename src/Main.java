import Carrito.Carrito;
import Factura.*;
import Producto.*;
import Cliente.*;
import Tienda.*;

public class Main {
    public static void main(String[] args) {

        Tienda t1 = new Tienda();




        //Se crean productos y se muestran
        Teclado tecladoGamer = new Teclado(36000,3,"Teclado Gamer","Logitech",true,false);
        Teclado tecladoGenerico = new Teclado(18999,10,"Teclado Generico","Lenovo",false,true);
        Mouse muoseGamer = new Mouse(21999,4,"Mouse Gamer","Logitech",true,true);
        Silla sillaOficina = new Silla(125000,3,"Silla Oficina Clasica","Home Office","Cuero");
        Pantalla monitorGamer = new Pantalla(255000,4,"Monitor Gamer","Asus",27);

        //creamos usuario y tambien los mostramos
        Cliente c1 = new Cliente(123455,"Matias","Galvan","matu@gmail.com");
        Cliente c2 = new Cliente(123456,"Rosana","Cardoso","roxi@hotmail.com");
        t1.agregarProducto(tecladoGamer);
        t1.agregarProducto(tecladoGenerico);
        t1.agregarProducto(sillaOficina);
        t1.agregarProducto(monitorGamer);
        t1.agregarProducto(muoseGamer);
        t1.agregarCliente(c1);
        t1.agregarCliente(c2);
        //creamos una factura
        /*
        Factura f1 = new Factura(c1);

        f1.agregarProducto(monitorGamer);
        f1.agregarProducto(tecladoGamer);
        f1.agregarProducto(muoseGamer);
        f1.agregarProducto(muoseGamer);

        //calculamos el monto
        f1.calcularMonto();
        System.out.println(f1);
        */
        /*Carrito carrito = new Carrito();
        carrito.agregarProducto(tecladoGamer,2);
        carrito.agregarProducto(tecladoGenerico,2);
        carrito.agregarProducto(tecladoGamer,1);
        carrito.mostrarCarrito();
        t1.mostrarProductosElectronicos();*/
        t1.gestionTienda();


    }
}