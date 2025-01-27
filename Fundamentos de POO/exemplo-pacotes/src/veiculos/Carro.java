package veiculos;

public class Carro extends Veiculo{
    // Encapsulamento
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo Câmbio em P");
    }
}
