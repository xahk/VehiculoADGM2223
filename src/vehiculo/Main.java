
package vehiculo;

/**
 *
 * @author Alejandro David Gómez Moreno
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGomezMorenoAD2223 miVehiculoGomezMorenoAD2223;
        int stockActual;
        
        miVehiculoGomezMorenoAD2223 = new VehiculoGomezMorenoAD2223("Seat",18000,100);
        operativaVehiculosGomezMorenoAD2223(miVehiculoGomezMorenoAD2223, 50); 
        stockActual = miVehiculoGomezMorenoAD2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosGomezMorenoAD2223(VehiculoGomezMorenoAD2223 miVehiculoGomezMorenoAD2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGomezMorenoAD2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGomezMorenoAD2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
