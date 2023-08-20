
package julian.development.practicareloj2;


public class Reloj {
    
    private double hora;
    private String fecha;
    private String modelo;
    private String serie;

    public Reloj(double hora, String fecha, String modelo, String serie) {
        this.hora = hora;
        this.fecha = fecha;
        this.modelo = modelo;
        this.serie = serie;
    }

    

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
    
    
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void mostrarHora() {
        System.out.println("Hora: " + hora);
    }
    
    public void mostrarFecha() {
        System.out.println("Fecha: " + fecha);
    }
    
    public void modificarHora(double nuevaHora) {
        hora = nuevaHora;
    }
    
    public void modificarFecha(String nuevaFecha) {
        fecha = nuevaFecha;
    }

    @Override
    public String toString() {
        return "Reloj{" + "hora=" + hora + ", fecha=" + fecha + '}';
    }
    
    

}
