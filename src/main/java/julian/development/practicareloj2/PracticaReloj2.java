package julian.development.practicareloj2;

import java.time.LocalDate;
import java.time.LocalTime;

public class PracticaReloj2 {

    public static void main(String[] args) {
       
        
        Reloj r1 = new Reloj(21.08, "19/08/2023", "Citizen Urban", "CitAS201");
        Persona persona = new Persona("Luis", r1);

        persona.mostrarHora();
        System.out.println("*************************");
        persona.mostrarFecha();

        persona.modificarHora(15.45);
        persona.modificarFecha("22/08/2023");
        System.out.println("*************************");
        persona.mostrarHora();
        System.out.println("*************************");
        persona.mostrarFecha();

     
        RelojFit r2 = new RelojFit(0, 0, 0, "19/08/2023", "APPLE SMARTWACH 3.0", "APPLE4050");
        System.out.println("*************************");
        r2.cuentaPasos(0, 0, 100, 100);
        System.out.println("*************************");
        r2.frecuenciaCardiaca();

    }
}
