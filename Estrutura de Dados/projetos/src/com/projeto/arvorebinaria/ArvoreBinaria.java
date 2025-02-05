package com.projeto.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(this.raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            // Procurando o nó para remover
            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) { // Nó não foi encontrado
                System.out.println("Conteúdo não encontrado. Bloco Try.");
            }

            if (pai == null) { // Nó a ser removido é o nó raiz
                if (atual.getNoDir() == null) { // Não tem filho a direita, então nova raiz passa a ser o filho a esquerda
                    this.raiz = atual.getNoEsq();

                } else if (atual.getNoEsq() == null) { // Não tem filho a esquerda, então nova raiz passa a ser o filho a direita
                    this.raiz = atual.getNoDir();

                } else { // Tem filhos, então transforma o maior filho da esquerda na raiz
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()) {

                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(this.raiz.getNoEsq());
                        }
                    }

                    filho.setNoDir(this.raiz.getNoDir());
                    this.raiz = filho;
                }

            } else if (atual.getNoDir() == null) {

            } else if (atual.getNoEsq() == null) {

            } else {

            }


        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco Catch.");
        }
    }

    public void exibirEmOrdem() {
        System.out.println("\nExibindo em Ordem:");
        exibirEmOrdem(this.raiz);
    }

    private void exibirEmOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirEmOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\nExibindo Pós Ordem:");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            exibirEmOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\nExibindo Pré Ordem:");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ", ");
            exibirEmOrdem(atual.getNoEsq());
            exibirEmOrdem(atual.getNoDir());
        }
    }

}
