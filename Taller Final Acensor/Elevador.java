public class Elevador {
    private int pisoActual;
    private boolean enMovimiento;

    public int getPisoActual() {
        return pisoActual;
    }

    public void moverA(int piso) {
        enMovimiento = true;
        System.out.println("Moviendo elevador al piso " + piso);
        pisoActual = piso;
        enMovimiento = false;
    }

    public void parar() {
        enMovimiento = false;
        System.out.println("Elevador detenido en piso " + pisoActual);
    }
}
