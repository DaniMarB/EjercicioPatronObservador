package EjercicioObservador;

public class MainClima {
    public static void main(String[] args) {
        Clima clima = new Clima();
        DispositivoMovil d1 = new DispositivoMovil("Tablet");
        DispositivoMovil d2 = new DispositivoMovil("Celular");
        DispositivoMovil d3 = new DispositivoMovil("Portatil");

        //System.out.println("Actualizando clima sin dispositivos registrados");
        //clima.cambiarClima(10,23);
        //System.out.println();

        System.out.println("Agregando dispositivos");
        clima.agregarObsservador(d1);
        clima.agregarObsservador(d2);
        clima.agregarObsservador(d3);
        System.out.println();

        System.out.println("Actualizando clima con dispositivos agregados");
        clima.cambiarClima(15,20);

        clima.eliminarObservador(d2);

        System.out.println("Actualizando clima con dispositivos agregados");
        clima.cambiarClima(10,10);


    }
}
