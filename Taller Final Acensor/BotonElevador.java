public class BotonElevador extends Boton {
    private int pisoDestino;

    public BotonElevador(String nombre, int pisoDestino) {
        super(nombre);
        this.pisoDestino = pisoDestino;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    @Override
    public void presionar(ControlElevador control) {
        super.presionar(control);
        control.moverElevador(pisoDestino);
        control.cancelarIluminacion(this);
    }
}
