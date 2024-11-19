
package Taller11.Ejercicio2;


public class Main {

    
    public static void main(String[] args) {
        
       // Creo una instancia gerente
        Empleado gerente = new Gerente("Ana", 3000000);
        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println(); // Separación de salidas

            // creo una instancia de vendedor
            Empleado vendedor = new Vendedor("Luis", 1500000, 1000000, 0.1); 
            System.out.println("Detalles del Vendedor:");
            vendedor.mostrarDetalles();
        }
    
}
