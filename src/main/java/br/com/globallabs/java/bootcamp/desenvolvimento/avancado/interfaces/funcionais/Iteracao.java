package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracao {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "Instrutor", "João", "Java"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirNumerosVezesDois(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.forEach(System.out::println);
        profissoes.stream().filter(profissao -> profissao.startsWith("Gerente")).forEach(System.out::println);
    }

    //String... = List<String>
    public static void imprimirNomesFiltrados(String... nomes){
        StringBuilder nomesParaImprimir= new StringBuilder();

        for(String nome : nomes){
            if(nome.equals("João"))
                nomesParaImprimir.append(nome);
        }

        System.out.println(nomesParaImprimir);

        // Stream ñ tem método construtor, é abstrato, então vai direto sem o new
        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                //Collectors.joining = transforma um array de String em uma unica String
                .collect(Collectors.joining());
        System.out.println("Stream: "+ nomesParaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        Stream.of(nomes).forEach(System.out::println);
    }

    public static void imprimirNumerosVezesDois(Integer... numeros){
        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
    }

}
