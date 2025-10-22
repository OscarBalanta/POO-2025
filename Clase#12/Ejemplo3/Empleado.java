public abstract  class Empleado {
    private String nombre;
    private double salario_Base;

  
    public Empleado(String nombre, double salario_Base) {
        this.nombre = nombre;
        this.salario_Base = salario_Base;
    }

 
    public abstract double calcular_Salario();


    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salario_Base;
    }
}

