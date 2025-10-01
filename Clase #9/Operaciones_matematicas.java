public class Operaciones_matematicas {
   
    //Atributos
    private int n1;
    private int n2;

    //Constructor de la clase
   public  Operaciones_matematicas (int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    //Metodo constructor e la clase: permite inicializar la clase 
    //Tiene el mismo nmbre que el de la clase 
    public int sumar(){
        return n1 + n2; 
    }

    public int restar(){
        return n1 - n2;
    }    
    
    public int multiplicar(){
        return n1 * n2;
    }   
    
    public double dividir(){
        double resultado;
        if (n2 == 0){
            resultado = 0.0;
        }else {
            resultado = (double ) n1 / (double) n2; //Convierte el numero a real 
        }
        return n1 / n2;
    }    

}
