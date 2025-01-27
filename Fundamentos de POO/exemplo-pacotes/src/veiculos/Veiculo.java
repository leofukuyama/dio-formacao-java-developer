package veiculos;

public abstract class Veiculo {
    // Herança
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Abstração
    public abstract void ligar();
}
