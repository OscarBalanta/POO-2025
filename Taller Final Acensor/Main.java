public class Main {
    public static void main(String[] args) {
        ControlElevador control = new ControlElevador();

        BotonPiso botonLlamada = new BotonPiso("Botón Piso 3", 3);
        BotonElevador botonDestino = new BotonElevador("Botón Piso 5", 5);

        
        botonLlamada.presionar(control);

        
        botonDestino.presionar(control);
    }
}
