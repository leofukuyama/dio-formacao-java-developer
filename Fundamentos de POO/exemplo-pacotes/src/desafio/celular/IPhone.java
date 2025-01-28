package desafio.celular;

import desafio.applications.AparelhoTelefonico;
import desafio.applications.NavegadorInternet;
import desafio.applications.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        verificarSinal();
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inicianod correio de voz...");
    }

    @Override
    public void verificarSinal() {
        System.out.println("Verificando sinal...");
    }

    @Override
    public void exibirPagina() {
        verificarConexao();
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        verificarConexao();
        System.out.println("Atualizando página...");
    }

    @Override
    public void verificarConexao() {
        System.out.println("Verificando conexão");
    }

    @Override
    public void tocar() {
        verificarSom();
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Parando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Adicionando música...");
    }

    @Override
    public void acessarBiblioteca() {
        System.out.println("Acessando biblioteca...");
    }

    @Override
    public void verificarSom() {
        System.out.println("Verificando som...");
    }
}
