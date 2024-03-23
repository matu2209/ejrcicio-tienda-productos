import Cliente.Cliente;
import Producto.*;
import Cliente.*;


public class Main {
    public static void main(String[] args) {

        //Se crean productos y se muestran
        Teclado tecladoGamer = new Teclado(36000,7,"Teclado Gamer","Logitech",true,false);
        Teclado tecladoGenerico = new Teclado(18999,10,"Teclado Generico","Lenovo",false,true);
        Mouse muoseGamer = new Mouse(21999,4,"Mouse Gamer","Logitech",true,true);
        Silla sillaOficina = new Silla(125000,3,"Silla Oficina Clasica","Home Office","Cuero");
        Pantalla monitorGamer = new Pantalla(255000,4,"Monitor Gamer","Asus",27);

        System.out.println(tecladoGamer);
        System.out.println(monitorGamer);
        System.out.println(tecladoGenerico);
        System.out.println(muoseGamer);
        System.out.println(sillaOficina);


        //creamos usuario y tambien los mostramos
        Cliente c1 = new Cliente("Matias","Galvan","matu@gmail.com");
        Cliente c2 = new Cliente("Rosana","Cardoso","roxi@hotmail.com");

        System.out.println(c1);
        System.out.println(c2);






    }
}