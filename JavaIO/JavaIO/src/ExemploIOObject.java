import java.io.*;

public class ExemploIOObject {
    public static void serealizacao() throws IOException {
        Gato gato = new Gato("Simba", 6, "amarelado", true, false);

        File f = new File("gato");

//        OutputStream os = new FileOutputStream(f.getName());
//        ObjectOutputStream oos = new ObjectOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\"criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

        oos.close();
    }

    public static void desserealizacao(String arquivo) throws IOException, ClassNotFoundException {
//        InputStream is = new FileInputStream(arquivo);
//        ObjectInputStream ois = new ObjectInputStream(is);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome..................: %s\n", objetoGato.getNome());
        System.out.printf("\nIdade.................: %d\n", objetoGato.getIdade());
        System.out.printf("\nCor...................: %s\n", objetoGato.getCor());
        System.out.printf("\nCastrado..............: %s\n", objetoGato.isCastrado());
        System.out.printf("\nRonrona...............: %s\n", objetoGato.isRonrona());

        System.out.println(objetoGato);

        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serealizacao();
        desserealizacao("gato");
    }
}
