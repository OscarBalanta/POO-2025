public class ControlElevador {

    private Elevador elevador;
    private Puertas puertas;

    public ControlElevador() {
        elevador = new Elevador();
        puertas = new Puertas();
    }

 
    public void moverElevador(int piso) {
        puertas.cerrarPuerta();
        elevador.moverA(piso);
        puertas.abrirPuerta();
    }

    public void pararElevador() {
        elevador.parar();
    }

    public void abrirPuerta() {
        puertas.abrirPuerta();
    }

    public void cerrarPuerta() {
        puertas.cerrarPuerta();
    }

    public void iluminarBoton(Boton boton) {
        boton.setIluminado(true);
        System.out.println("Botón " + boton.getNombre() + " iluminado.");
    }

    public void cancelarIluminacion(Boton boton) {
        boton.setIluminado(false);
        System.out.println("Iluminación cancelada en " + boton.getNombre());
    }

    
    // Elevador ahora es una clase independiente en Elevador.java

    class Puertas {
        private boolean abiertas;

        public boolean isAbiertas() {
            return abiertas;
        }

        public void abrirPuerta() {
            abiertas = true;
            System.out.println("Puertas abiertas.");
        }

        public void cerrarPuerta() {
            abiertas = false;
            System.out.println("Puertas cerradas.");
        }
    }
}
