import java.util.ArrayList;

public class Ejecutar_empleados {

public static void main(String[] args) {
    


        Empleado Gerente = new Gerente("Oscar", 500, 1000);
        Empleado Vendedor = new Vendedor("Natalia" , 350, 500);


           ArrayList<Empleado> empleado = new ArrayList<>();
        empleado.add(Gerente);
        empleado.add(Vendedor);

        for (Empleado Empleado : empleado) {
            System.out.println("Empleado: " + Empleado.getNombre() + " - Salario: " + Empleado.calcular_Salario());
        }
    }
}