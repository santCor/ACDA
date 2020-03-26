
package ud_2;

/**
 *
 * @author sanruiade
 */

public class Ud_2 {

    public static void main(String[] args) {
      
        Rental r = new Rental();
        r.conexionBD();
            r.devolverCar(599, 100);
            r.debedasCustomer(701); // Ejercicio 2
            r.infoTaboa("cars"); // Ejercicio 3
        r.cerrarConexionBX();       
    }
}
