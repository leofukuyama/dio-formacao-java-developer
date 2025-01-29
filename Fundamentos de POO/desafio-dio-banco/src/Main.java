import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente clienteLeonardo = new Cliente("Leonardo Oliveira");
        Cliente clienteTeste = new Cliente("Teste Test");

        banco.cadastrarCliente(clienteTeste);
        banco.cadastrarCliente(clienteLeonardo);

        banco.mostrarLista();

        Conta corrente = new ContaCorrente(clienteLeonardo);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(clienteLeonardo);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
