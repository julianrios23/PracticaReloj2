
package julian.development.practicareloj2;


public class RelojFit extends Reloj {
    
     private int cuentaPasos;
    private int frecuenciaCardiaca;

    public RelojFit(int cuentaPasos, int frecuenciaCardiaca, double hora, String fecha, String modelo, String serie) {
        super(hora, fecha, modelo, serie);
        this.cuentaPasos = cuentaPasos;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    

   

    public void cuentaPasos(int x1, int y1, int x2, int y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        cuentaPasos += (int) distancia;
        System.out.println("Cuenta de pasos: " + cuentaPasos);
    }

    public void frecuenciaCardiaca() {
        frecuenciaCardiaca = (int) (Math.random() * (100 - 60 + 1)) + 60;
        System.out.println("Frecuencia cardíaca: " + frecuenciaCardiaca);
    }

}
