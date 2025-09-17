import java.util.Scanner;

public class Practica_condicionales {
    public static void main(String[] args) {

    /*
     * Ejercicio 4.1.a)
     * Si la temperatura es superior a 100 grados, visualizar el
     * mensaje “por encima del punto de ebullición del agua” sino  
     * Visualizar el mensaje “por debajo del punto de ebullición del agua”
     * Entrada Temperatua
     * Proceso:Validar que la temperatura sea superior a 100 grados
     * Salida: si alcaanza o no el punto de ebulición 
    */

     int angulo = 90;
     if ( angulo ==90){ 
        System.out.println("El angulo es un angulo recto");
        } else 
            {
                System.out.println("El angulo no es un angulo recto");
                
            }
        

         /*
        * Ejercicio 4.1.a)
        * Si la temperatura es superior a 100 grados, visualizar el
        * mensaje “por encima del punto de ebullición del agua” sino  
        * Visualizar el mensaje “por debajo del punto de ebullición del agua”
        * Entrada Temperatua
        * Proceso:Validar que la temperatura sea superior a 100 grados
        * Salida: si alcaanza o no el punto de ebulición 
        */

            double Temperatura = 30.0;
            if (Temperatura> 100){
                System.out.println("por encima de  el punto de ebullición del agua");
            } else 
                {
                    System.out.println("pordebajo de  el punto de ebullición del agua");
                }
                   

        /*
        * Ejercicio 4.1.a)
        * Si  el número es positivo, sumar el , sumar el número a total
        * de positivos, sino 
        * sumar al total de negativos
        * Entrada: Numero
        * Proceso: Validar si el Numero es positivo o negtivo
        * Salida: Validar el total de numeros positivos y negativos 
        */

        int numero = -5;
        
        if(numero > 0){
            System.out.println("El número es positivo");
        }else if(numero < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es cero");
        }

        //-----D

        int Num = 0;
        double x = 3;
        double y = 1;
        double z = 12;
        double p = 0;
        if(x > y && z < 20){
          System.out.println(p);
        }

        //------Distancia

        double distancia = 23;
        double tiempo = 0;
        if(distancia > 20 && distancia < 35){
            System.out.println(tiempo);
        }


        //------Numeros mayor o menor

        int NUM1 = 10;
        int NUM2 = 122;
        if(NUM1 > NUM2){
         System.out.println("El primer numero es el mayor");
        }else if(NUM1 < NUM2){
            System.out.println("El primer numero es el mas pequeño");
        } else {
            System.out.println("Ambos numeros tienen el mismo valor");
        }


        //----Numeros cetral

        int Nmenor = 100;
        int Ncentral = 150;
        int Nmayor = 200;
        double NumCentral = 0;
        if (Nmenor < Ncentral && Nmayor > Ncentral){
              System.out.println("El numero central es " +Ncentral);
        }

       //-----Raiz de un Numero
       double NRAIZ = 25;
        System.out.println(Math.sqrt(NRAIZ));
       
       //----Numeros pares o impares 
          Scanner teclado = new Scanner(System.in);
       
        int NUMBER;
       
        System.out.print("ingrese el Numero: ");
        NUMBER = teclado.nextInt();
       
        if(NUMBER % 2 == 0) {
            System.out.println(NUMBER+" es un número par");
        }else {
            System.out.println(NUMBER+" no es un número par");
        }

        //---fECHAS
          Scanner scanner = new Scanner(System.in);

     
        System.out.print("Introduce el día: ");
        int Dia = scanner.nextInt();
        System.out.print("Introduce el mes: ");
        int Mes = scanner.nextInt();
        System.out.print("Introduce el año: ");
        int Anio = scanner.nextInt();

        int diaSiguiente = Dia;
        int mesSiguiente = Mes;
        int anioSiguiente = Anio;

        
        boolean bisiesto = false;
        if ((Anio % 4 == 0 && Anio % 100 != 0) || (Anio % 400 == 0)) {
            bisiesto = true;
        }

        int diasDelMes = 31;

        if (Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11) {
            diasDelMes = 30;
        } else if (Mes == 2) {
            if (bisiesto) {
                diasDelMes = 29;
            } else {
                diasDelMes = 28;
            }
        }

       
        if (Dia < diasDelMes) {
            diaSiguiente = Dia + 1;
        } else {
            diaSiguiente = 1;
            if (Mes < 12) {
                mesSiguiente = Mes + 1;
            } else {
                mesSiguiente = 1;
                anioSiguiente = Anio + 1;
            }
        }

        
        System.out.println("La fecha del día siguiente es: " + diaSiguiente + "/" + mesSiguiente + "/" + anioSiguiente);

        
        //-----Peso academico
        
          Scanner Teclado = new Scanner(System.in);

         System.out.print("Introduce tu Peso: ");
         int Peso1 = Teclado.nextInt(); 

         int NumPeso = 0 ;
         int Peso2 = 50;
         int Peso3 = 60;


         if (NumPeso > Peso1){
            System.out.println(NumPeso+ "Gordo");
        }else{
            if (NumPeso > Peso1 && NumPeso < Peso2){
                System.out.println("Gordo");
            }
        }
        
         System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        
        if (num1 != 0 && num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else {
            System.out.println("Ninguno es divisor del otro.");
        }
    

    }

       
      

        
    

        
       
}





   

    
