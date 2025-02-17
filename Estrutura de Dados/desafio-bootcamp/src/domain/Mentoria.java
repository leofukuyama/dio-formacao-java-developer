package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataLocal;

    public Mentoria() {
    }

    @Override
    public double calcularpXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataLocal() {
        return this.dataLocal;
    }

    public void setDataLocal(LocalDate dataLocal) {
        this.dataLocal = dataLocal;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataLocal=" + this.dataLocal +
                '}';
    }
}
