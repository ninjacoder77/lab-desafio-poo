package org.dio;

import org.dio.models.Bootcamp;
import org.dio.models.Curso;
import org.dio.models.Desenvolvedor;
import org.dio.models.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor desenvolvedorFelipe = new Desenvolvedor();
        desenvolvedorFelipe.setNome("Felipe");
        desenvolvedorFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + desenvolvedorFelipe.getConteudosInscritos());
        desenvolvedorFelipe.progredir();
        desenvolvedorFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + desenvolvedorFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Felipe:" + desenvolvedorFelipe.getConteudosConcluidos());
        System.out.println("XP:" + desenvolvedorFelipe.calcularTotalXp());

        System.out.println("\n\n-------\n\n");

        Desenvolvedor desenvolvedorJoao = new Desenvolvedor();
        desenvolvedorJoao.setNome("Joao");
        desenvolvedorJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + desenvolvedorJoao.getConteudosInscritos());
        desenvolvedorJoao.progredir();
        desenvolvedorJoao.progredir();
        desenvolvedorJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + desenvolvedorJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + desenvolvedorJoao.getConteudosConcluidos());
        System.out.println("XP:" + desenvolvedorJoao.calcularTotalXp());

    }
}