import Level1.Exceptions.VentaVacia;
import Level1.Producto;
import Level1.Venta;

public class MainProductos {


  public static void main(String[] args) {

    Venta cesta = new Venta();

    Producto p1 = new Producto("Jugo", 2.50);
    Producto p2 = new Producto("Galletas", 1.80);


    try {
        System.out.println("El total de esta venta es: " + cesta.calculateTotal());
        } catch (VentaVacia e) {
                System.out.println(e.getMessage());
        }

    cesta.addProducto(p1);
    cesta.addProducto(p2);


    try {
        System.out.println("Funcionamiento correcto: El total de esta venta es: " + cesta.calculateTotal());
        } catch (VentaVacia e) {
                System.out.println(e.getMessage());
        }


        double tresPorUno = 0.0;

    {
        try {
            for (int i = 0; i < 3; i++) {
                tresPorUno += cesta.getProducts().get(i).getPrice();
                tresPorUno = tresPorUno * 0.7;
                } System.out.println("Este es el total a pagar despues del  descuento: " + tresPorUno);

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Atrapando Error IndexOutOfBounds: Tiene que haber al menos 3 elementos en la venta para hacer un descuento");
        }
    }
  }
}