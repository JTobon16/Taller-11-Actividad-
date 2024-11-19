
package Taller11.Ejercicio1;

public abstract class Figura {
    
    //metodo abstracto para las clases 
    public abstract double calcularArea();
    
    //metodo que me mostrara el area
    public void mostrarArea(){
        System.out.println("El area es: "+calcularArea());}
         
    
}
