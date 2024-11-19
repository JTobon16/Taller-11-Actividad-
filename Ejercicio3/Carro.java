
package Taller11.Ejercicio3;


public abstract class Carro {
    
      protected String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public abstract int calcularVelocidadMaxima(); 

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + calcularVelocidadMaxima() + " km/h");
    }
    
}
