
package julian.development.practicareloj2;

/**
 
 * @author Julian Rios
 */
public class Persona {

      private String nombre;
    private Reloj reloj;
    
    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }
    
    public void mostrarHora() {
        System.out.print(nombre + " - ");
        reloj.mostrarHora();
    }
    
    public void mostrarFecha() {
        System.out.print(nombre + " - ");
        reloj.mostrarFecha();
    }
    
    public void modificarHora(double nuevaHora) {
        reloj.modificarHora(nuevaHora);
    }
    
    public void modificarFecha(String nuevaFecha) {
        reloj.modificarFecha(nuevaFecha);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", reloj=" + reloj + '}';
    }
    
    
}
