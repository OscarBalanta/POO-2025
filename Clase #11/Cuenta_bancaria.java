public class Cuenta_bancaria {

    // TODO : Defina los atributos privados

      private String titular_Cuenta;
    private String numeroCuenta;
    private double saldo_Cuenta;

    // TODO : Constructor por defecto

    public Cuenta_bancaria() {
        this.titular_Cuenta = "Sin nombre";
        this.numeroCuenta = "000000";
        this.saldo_Cuenta = 0.0;
    }

    // TODO : Constructor parametrizado

    public Cuenta_bancaria(String titular, String numeroCuenta, double saldo) {
        if (titular == null || titular.isEmpty()) {
            this.titular_Cuenta = "Sin nombre";
        } else {
            this.titular_Cuenta = titular;
        }

        if (numeroCuenta == null || numeroCuenta.length() < 6) {
            this.numeroCuenta = "000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        }

        if (saldo < 0) {
            this.saldo_Cuenta = 0.0;
        } else {
            this.saldo_Cuenta = saldo;
        }
    }

    // TODO : Getters y Setters con validaciones

    public String getTitular() {
        return titular_Cuenta;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular_Cuenta = titular;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo_Cuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo_Cuenta = saldo;
        }
    }

    // ===== Método depositar =====

    public void depositar(double monto) {
        if (monto > 0) {
            saldo_Cuenta += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo_Cuenta);
        } else {
            System.out.println("Error: el monto debe ser positivo.");
        }
    }

    // TODO : M t o d o retirar
  
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo_Cuenta) {
            saldo_Cuenta -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo_Cuenta);
        } else {
            System.out.println("Error: saldo insuficiente o monto inválido.");
        }
    }

    // TODO : M t o d o toString

    @Override
    public String toString() {
        return "Cuenta Bancaria [" +
               "Titular: " + titular_Cuenta +
               ", Número de cuenta: " + numeroCuenta +
               ", Saldo: $" + saldo_Cuenta + "]";
    }
}



