public class Vendedor extends Empleado {
    private double comisionVentas;

    public Vendedor(String nombre, double salarioBase, double comisionVentas) {
        super(nombre, salarioBase);
        this.comisionVentas = comisionVentas;
    }

    @Override
    public double calcular_Salario() {
        return getSalarioBase() + comisionVentas;  // Salario base + comisión por ventas
    }
}
