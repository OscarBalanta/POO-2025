import java.util.Scanner;

public class ejecutar_OPM{
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el primer numero");
            int a = sc.nextInt();
             System.out.println("Digite el segundo numero");
            int b = sc.nextInt();
            

        
            Operaciones_matematicas objOp = new Operaciones_matematicas(a,b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicacíon es: " + objOp.multiplicar());
        System.out.println("El resultado de la divisíon es: " + objOp.dividir());

        sc.close();
    }
}
