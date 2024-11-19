
package Taller11.Ejercicio2;


public class Gerente extends Empleado{
     private double sueldoBase;

    public Gerente(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase;
    }
}
