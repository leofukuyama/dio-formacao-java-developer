package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("MARCOS", "123");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
