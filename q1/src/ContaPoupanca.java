class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public double calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo; // 0,5% ao mês
        } else {
            rendimento = 0.007 * selic * saldo; // 70% da Selic
        }
        return rendimento;
    }
}