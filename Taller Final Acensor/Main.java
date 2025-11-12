public class Main {
    public static void main(String[] args) {
        ControlElevador control = new ControlElevador();

        BotonPiso botonLlamada = new BotonPiso("Botón Piso 3", 3);
        BotonElevador botonDestino = new BotonElevador("Botón Piso 5", 5);

        // Usuario llama al elevador
        botonLlamada.presionar(control);

        // Usuario dentro del elevador selecciona un piso
        botonDestino.presionar(control);
    }
}
