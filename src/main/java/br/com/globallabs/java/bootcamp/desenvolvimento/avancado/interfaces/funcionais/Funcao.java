package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

import java.util.function.Function;

//recebem um parametro e retornam um parametro também
public class Funcao {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Karine"));


        Function<String, Integer> retornaQuantidadeLetrasNomeVezesDois = variavel -> new StringBuilder(variavel).length() * 2;
        System.out.println(retornaQuantidadeLetrasNomeVezesDois.apply("Karine"));
        Integer a = retornaQuantidadeLetrasNomeVezesDois.apply("Karine");
        System.out.println(a);
    }
}
