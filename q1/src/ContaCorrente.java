class ContaCorrente extends Conta {
    double chequeEspecial = 1000.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= (saldo + chequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com cheque especial!");
        } else {
            System.out.println("Limite do cheque especial insuficiente!");
        }
    }
}

