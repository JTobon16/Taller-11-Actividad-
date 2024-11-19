
package Taller11.Ejercicio2;


public class Vendedor extends Empleado  {
    
    private double sueldoBase;
    private double ventas;
    private double porcentajeComision;

    public Vendedor(String nombre, double sueldoBase, double ventas, double porcentajeComision) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + (ventas * porcentajeComision);
    }
}
