import java.io.*;
import java.util.Scanner;

public class ExemploIOData {
    public static void incluirProduto() throws IOException {
        File f = new File("C:\\Users\\massa\\OneDrive\\Área de Trabalho\\Cursos\\DIO\\Formação Java Developer\\dio-formacao-java-developer\\JavaIO\\JavaIO\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

//        OutputStream os = new FileOutputStream(f.getPath());
//        DataOutputStream dos = new DataOutputStream(os);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/GG): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        dos.close();
        scan.close();


    }

    public static void lerProduto() {

    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
