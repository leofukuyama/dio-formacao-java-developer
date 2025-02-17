import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setDataLocal(LocalDate.now());

//        System.out.println(mentoria);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos: " + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("Conteúdos Concluídos: " + devLeonardo.getConteudosConcluidos());
        System.out.println("\nConteúdos Inscritos: " + devLeonardo.getConteudosInscritos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("\nConteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
