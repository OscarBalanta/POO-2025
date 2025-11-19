

public class Boton {
    private String nombre;
    private boolean iluminado;

    public Boton(String nombre) {
        this.nombre = nombre;
        this.iluminado = false;
    }

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
