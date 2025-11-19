public class BotonPiso extends Boton {
    private int pisoOrigen;

    public BotonPiso(String nombre, int pisoOrigen) {
        super(nombre);
        this.pisoOrigen = pisoOrigen;
    }

    public int getPisoOrigen() {
        return pisoOrigen;
    }

    @Override
    public void presionar(ControlElevador control) {
        super.presionar(control);
        System.out.println("Llamando elevador al piso " + pisoOrigen);
        control.moverElevador(pisoOrigen);
        control.cancelarIluminacion(this);
    }
}
