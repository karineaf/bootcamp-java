package br.com.globallabs.java.bootcamp.collections.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> capitais = new TreeSet<>();
        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        //capitais.add("Belo Horizonte");
        System.out.println(capitais);

        //retorna 1º na lista
        System.out.println(capitais.first());

        //retorna último na lilsta
        System.out.println(capitais.last());

        //retorna o 1º elemento abaixo do elemento parametrizado
        System.out.println("Abaixo de Florianópolis: " + capitais.lower("Florianópolis"));

        //retorna o 1º elemento acima do elemento parametrizado
        System.out.println("Acima de Florianópolis: " + capitais.higher("Florianópolis"));

        //exibe todos os elementos
        System.out.println(capitais);

        //retorna o 1º elemento no início da árvore, removendo da lista
        System.out.println(capitais.pollFirst());

        //retorna o 1º elemento no final da árvore, removendo da lista
        System.out.println(capitais.pollLast());

        while (capitais.iterator().hasNext());
            System.out.println(capitais.iterator().next());

        for(String capital : capitais)
            System.out.println(capital);

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(capitais.last());
        System.out.println(capitais.higher("Florianópolis"));
        System.out.println(capitais.first());
        System.out.println(capitais.lower("Florianópolis"));
        System.out.println(capitais.higher("Florianópolis"));



    }
}
