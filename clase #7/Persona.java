public class Persona {
    
    //atributos
    private  int identificacion;
     private  String  nombres;
     private String apellidos;
     private  int edad;
     private  double estatura;
     private  double peso;

     //Metodo constructor de la clase
     //E constructor de la clase permite inicializar la clase
     //la palabra reservada "this" se utiliza para autoreferenciar el atributo de la clase
     public Persona(int identificacion, String nombres, String apellidos, int edad, double estatura, double peso){
       this.identificacion = identificacion;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.edad = edad;
       this.estatura = estatura;
       this.peso = peso;
    }


     //Metodos

     public void caminar(){
         System.out.println("caminar");
     }
     public boolean jugar(){
        return true;
     }
     public void comer(){
         System.out.println("comiendo");
     }
     public String estudiar(String carrera){
        return "Usted esta estudiandon: " + carrera;
     }

}
