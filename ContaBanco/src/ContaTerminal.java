import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo" +
                " %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
