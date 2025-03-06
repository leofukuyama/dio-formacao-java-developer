import java.io.*;

public class ExemploIOBytes {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\massa\\OneDrive\\Área de Trabalho\\Cursos\\DIO\\Formação Java Developer\\dio-formacao-java-developer\\JavaIO\\JavaIO\\recomendacoes-copy.txt");
        String nomeArquivo = f.getName();

//        InputStream is = new FileInputStream(nomeArquivo);
//        BufferedInputStream bis = new BufferedInputStream(is);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
        File fCopy = new File(nomeArquivoCopy);

//        OutputStream os = new FileOutputStream(nomeArquivoCopy);
//        BufferedOutputStream bos = new BufferedOutputStream(os);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes",
                fCopy.getName(), fCopy.getPath(), fCopy.length());
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
