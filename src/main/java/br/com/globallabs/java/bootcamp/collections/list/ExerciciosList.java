package br.com.globallabs.java.bootcamp.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {
        //Crie uma lista e execute as seguintes operações:
        //  * adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        //  * navegue na lista exibindo cada nome no console
        //  * substitua o nome Carlos por Roberto
        //  * retorne o nome da posição 1.
        //  * retorne o nome da posição 4.
        //  * remova o nome João.
        //  * retorne a quantidade de itens na lista
        //  * verifique se o nome Juliano existe na lista.
        //  * crie uma nova lista com novos nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na 1ª lista criada
        //  * ordene os itens da lista por ordem alfabética.
        //  * verifique se a lista está vazia.


        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes)
            System.out.println(nome);

        nomes.set(2, "Roberto");

        System.out.println(nomes.get(0));
        System.out.println(nomes.get(3));

        nomes.remove("João");

        System.out.println(nomes.size());

        System.out.println("O nome Juliano existe na lista? " + nomes.contains("Juliano"));

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.addAll(nomes2);

        Collections.sort(nomes);

        System.out.println("A lista está vazia? " + nomes.isEmpty());

        System.out.println(nomes);

    }
}
