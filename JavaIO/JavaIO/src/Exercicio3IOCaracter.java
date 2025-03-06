import java.io.*;

public class Exercicio3IOCaracter {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\massa\\OneDrive\\Área de Trabalho\\Cursos\\DIO\\Formação Java Developer\\dio-formacao-java-developer\\JavaIO\\JavaIO\\recomendacoes.txt");
        String nomeArquivo = f.getName();

//        Reader r = new FileReader(nomeArquivo);
//        BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");

        File fileCopia = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopia.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes\n", fileCopia.getName(), fileCopia.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fileCopia.getName());

        pw.printf("Ok! Tudo certo. Tamanho do arquivo %d bytes", fileCopia.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
