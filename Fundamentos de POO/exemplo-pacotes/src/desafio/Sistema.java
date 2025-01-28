package desafio;

import desafio.celular.IPhone;

public class Sistema {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.ligar("(43) 9 9999-9999");
        iPhone.atender();
        iPhone.exibirPagina();
        iPhone.tocar();
    }
}
