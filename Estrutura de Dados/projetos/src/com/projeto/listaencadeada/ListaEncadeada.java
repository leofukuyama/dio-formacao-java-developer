package com.projeto.listaencadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        int contadorIndex = 0;

        for (int i = 0; i <= this.size() - 1; i++) {
            if (index == contadorIndex) {
                noRetorno = noAuxiliar;
                return noRetorno;
            }

            noAuxiliar = noAuxiliar.getProximoNo();
            contadorIndex++;
        }

        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);

        if (index == 0) {
            this.referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;

                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta listsa só vai até o índice " + ultimoIndice + ".");
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
