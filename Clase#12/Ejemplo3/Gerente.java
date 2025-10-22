public class Gerente  extends Empleado{
    private double salario;

    public Gerente( String nombre, double salario_Base, double salario){
        super(nombre, salario_Base);
        this.salario = salario;
    }

    @Override
    public double calcular_Salario(){
        return  getSalarioBase() + salario;
    }
}
