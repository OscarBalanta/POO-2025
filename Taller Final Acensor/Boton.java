

public class Boton {
    private String nombre;
    private boolean iluminado;

    public Boton(String nombre) {
        this.nombre = nombre;
        this.iluminado = false;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    
    public void presionar(ControlElevador control) {
        control.iluminarBoton(this);
    }
}


class BotonElevador extends Boton {
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


class BotonPiso extends Boton {
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
