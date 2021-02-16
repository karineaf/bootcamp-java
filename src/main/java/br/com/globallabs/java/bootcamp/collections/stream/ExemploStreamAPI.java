package br.com.globallabs.java.bootcamp.collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thaise");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Jhuliana");
        estudantes.add("Thiago");
        estudantes.add("Raphawel");
        estudantes.add("Leticia");
        estudantes.add("Maira");

        //Conta os elementos através de stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna elemento com menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que contém R
        // Filter sempre recebe uma regra que deve retornar true ou false
        //Filter retorna uma lista de tamanho variável
        System.out.println("Com a letra R: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase(Locale.ROOT)
                .contains("r")).collect(Collectors.toList()));

        //Retorna nova coleção com nomes concatenados a quantidade de letra de cada nome
        //Map retorna uma lista coma mesma quantidade de elementos
        System.out.println("Coleção com quantidade de letras: " + estudantes.stream().map((estudante) -> estudante.concat(" - ")
                .concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna os 3 primeiros elementos da coleção
        System.out.println("3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elementro no console e retorna a mesma coleção
        //Recebe uma função, executa e não retorna nada
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elementro no console e não retorna outra coloção
        //Não retorna nada
        System.out.println("Retorna novamente os elementos: ");
        estudantes.stream().forEach((elemento -> System.out.println(elemento)));

        //Retorna true se todos os elementos possuem W
        System.out.println("Todos elementos possuem W? " +
                estudantes.stream().allMatch(elemento -> elemento.contains("W")));

        //Retorna true se algum elemento possue a
        System.out.println("Algum elemento tem letra a? " +
                estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        //Retorna true se nenhum elemento possui a letra
        System.out.println("Há algum elemento com letra maiúscula?" +
                estudantes.stream().noneMatch((elemento) -> elemento.contains("y")));

        //Retorna o primeiro elemento da coleção
        System.out.println("1º elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada");
        System.out.println(estudantes.stream()
                .peek(System.out::println) //mostra o nome
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))) //transforme em nome + length
                .peek(System.out::println) // mostra de novo
                .filter(estudante -> estudante.toLowerCase(Locale.ROOT).contains("a")) //filtra por A
//                .collect(Collectors.toList()));
                //Retorna uma String com os elementos separados por ,
//                .collect(Collectors.joining(", ")));
                //Não possue ordem garantida
//                .collect(Collectors.toSet()));
                // Agrupa de acordo com a regra de: juntar todos com mesmo length
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));





    }
}
