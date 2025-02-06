package com.projeto.arvorebinaria;

import com.projeto.arvorebinaria.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<Obj>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));
        minhaArvore.inserir(new Obj(11));

        minhaArvore.exibirEmOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        minhaArvore.remover(new Obj(13));

        minhaArvore.exibirEmOrdem();
    }
}
