/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller11.Ejercicio1;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           // cree la instancia de circulo
        Circulo circulo = new Circulo(12);
        System.out.println("---Area del circulo---");
        circulo.mostrarArea();

        // cree la instancia de rectangulo
        Rectangulo rectangulo = new Rectangulo(3, 6);
        System.out.println("---Area del rectangulo---");
        rectangulo.mostrarArea();
        
    }
    
}
