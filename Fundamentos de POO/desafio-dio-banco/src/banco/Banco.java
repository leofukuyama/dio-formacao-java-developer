package banco;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    public static final String NOME = "BANCO";
    protected List<Cliente> lista = new LinkedList<Cliente>();

    public void cadastrarCliente(Cliente cliente) {;
        this.lista.add(cliente);
    }

    public void mostrarLista() {
        System.out.println(lista);
    }
}
