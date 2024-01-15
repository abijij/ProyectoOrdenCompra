import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

       OrdenCompra orden1 = new OrdenCompra("Se realizo la compra de componentes de una pc");
       orden1.setCliente(new Cliente("Edgar", "Gutierrez"));
       orden1.setFecha(new Date());

       orden1.addProducto(new Producto("Kingston","Disco duro SSD M2", 680));
        orden1.addProducto(new Producto("Machenike","Teclado Mecanico", 2700));
        orden1.addProducto(new Producto("Razer","Mouse Jummper", 780));
        orden1.addProducto(new Producto("Razer","Razer Nagga", 800));

        OrdenCompra orden2 = new OrdenCompra("Se realizo mantenimiento de una pc ");
        orden2.setCliente(new Cliente("Gabriela","Ponce Hernanadez"));
        orden2.setFecha(new Date());

         orden2.addProducto(new Producto("Posdevv","Cambio de pasta termica",300));
         orden2.addProducto(new Producto("Posdevv","Limpieza profundfa", 700));
         orden2.addProducto(new Producto("Posdevv", "Cambio de fuente", 1500));
         orden2.addProducto(new Producto("Posdevv","Cambio de procesador", 5700));

         OrdenCompra orden3 = new OrdenCompra("Creacion de Pagina web");
         orden3.setCliente(new Cliente("Antuan","Gutierrez Ponce"));
         orden3.setFecha(new Date());

         orden3.addProducto(new Producto("Possdevv", "Definicion de poryecto",18000));
         orden3.addProducto(new Producto("Possdevv","Definicion de tegnologias", 10000));
         orden3.addProducto(new Producto("Posdevv","Se empieza desarrollo", 30000));
         orden3.addProducto(new Producto("Possdevv","Primera entrega de avances",24000));

            OrdenCompra[] ordenes = {orden1,orden2,orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: "+ orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion" + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.totalCompra());
            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
        }

        System.out.println("---------------------------------- siguiente --------------------------------------");


    }
}



