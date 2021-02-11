package br.com.globallabs.java.bootcamp.collections.comparators;

import java.util.*;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Amanda", 24));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        estudantes.add(new Estudante("Beatriz", 20));
        System.out.println("--Ordem de inserção--\n" + estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("\n--Ordem natural dos números - idade--\n" + estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("--Ordem reversa dos números - idade--\n" + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("\n--Ordem natural dos números - idade (method reference)--\n" + estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--Ordem reversa dos números - idade (method reference)--\n" + estudantes);

        Collections.sort(estudantes);
        System.out.println("\n--Ordem natural dos números - idade (interface comparable)--\n" + estudantes);

        estudantes.sort(new EstudanteOrdemReversaComparator());
        System.out.println("--Ordem reversa dos números - idade (interface comparable)--\n" + estudantes);

    }
}
