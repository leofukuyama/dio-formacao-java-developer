package conta;

import cliente.Cliente;

public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato");
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", getCliente().getNome());
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Numero: %d%n", getNumero());
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
    }
}
