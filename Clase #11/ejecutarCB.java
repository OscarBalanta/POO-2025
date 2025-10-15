public class ejecutarCB {
    
public static void main(String[] args) {

        Cuenta_bancaria cuenta1 = new Cuenta_bancaria("Oscar Daniel", "123456", 1000);

        Cuenta_bancaria cuenta2 = new Cuenta_bancaria("", "12", -100);

        
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.depositar(100);
        cuenta1.retirar(100);
        cuenta1.retirar(700); 

        System.out.println("Saldo final: $" + cuenta1.getSaldo());
    }
}
