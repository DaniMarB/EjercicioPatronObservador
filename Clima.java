package EjercicioObservador;


import java.util.ArrayList;

public class Clima {

    private ArrayList<ObservadorClima> observadores;

    private double temperatura;
    private double humedad;


    public Clima(){
        observadores = new ArrayList<ObservadorClima>();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void agregarObsservador(ObservadorClima obs){
        if(observadores.add(obs)){
            System.out.println("Observador "+ obs + "agregado");
        }else{
            System.out.println("No pudo ser agregado el observador "+obs);
        };
    }

    public void eliminarObservador(ObservadorClima obs){
        if(observadores.add(obs)){
            System.out.println("Observador "+ obs + "eliminado");
        }else{
            System.out.println("No pudo ser eliminado el observador "+obs);
        };
    }

    public void cambiarClima(double temperatura, double humedad){
        this.setTemperatura(temperatura);
        this.setHumedad(humedad);
        notificar();
    }

    public void notificar() {
        for (ObservadorClima obs : observadores) {
            obs.actualizar(this.temperatura, this.humedad);
        }
    }
}
