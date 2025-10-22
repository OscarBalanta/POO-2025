public class ejecutarCB {

    public static void main(String[] args) {

        // Cuenta bancaria
        Cuenta_bancaria cuenta1 = new Cuenta_bancaria("Oscar Daniel", "123456", 2000);
        Cuenta_bancaria cuenta2 = new Cuenta_bancaria("", "12", -100);

        double descuento = cuenta1.getSaldo() * 0.20;
        double saldoConDescuento = cuenta1.getSaldo() - descuento;
        cuenta1.setSaldo(saldoConDescuento);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.depositar(100);
        cuenta1.retirar(100);
        cuenta1.retirar(700);

        System.out.println("Saldo final: $" + cuenta1.getSaldo());

        // Producto
        Producto prod1 = new Producto("P001", "Laptop", 2, 750.00);
        Producto prod2 = new Producto(); // usa constructor por defecto

        System.out.println("\n------- Información de productos --------");

        System.out.println(prod1);
        System.out.println(prod2);

        // Aplicar operaciones
        prod1.aplicarDescuento(10); // 10% de descuento
        prod1.incrementarCantidad(3); // Añadir 3 unidades más

        System.out.println("\n------- Producto con descuento y cantidad incrementada -----");
        System.out.println(prod1);
    }
}

