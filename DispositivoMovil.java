package EjercicioObservador;

public class DispositivoMovil implements ObservadorClima {
    private String nombre;

    public DispositivoMovil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(double temperatura, double humedad) {
        System.out.println("Cambiando la temperatura a "+ temperatura+" y la humedad a "+ humedad+" desde el dispositivo movil "+nombre);
    }
}
