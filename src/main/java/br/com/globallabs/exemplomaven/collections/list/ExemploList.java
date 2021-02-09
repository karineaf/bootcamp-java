package br.com.globallabs.exemplomaven.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Karine");
        nomes.add("Sofie");
        nomes.add("Telma");
        nomes.add("Andressa");
        nomes.add("Pedro");
        nomes.add("Hellen");

        System.out.println(nomes);

        //coloca em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(0, "Anderson");
        System.out.println(nomes);

        //remove pelo indice
        //nomes.remove(2);

        //remove pelo objeto
        nomes.remove("Anderson");
        System.out.println(nomes);

        System.out.println(nomes.get(0));

        //erro de out of bounds
        //System.out.println(nomes.get(5));

        //retorna a quantidade de elementos dentro da lista
        System.out.println(nomes.size());

        //boolean - tem diferença de capslock
        System.out.println("Contém Karine? " + nomes.contains("Karine"));

        //verifica se está vazio
        System.out.println("Está vazio? " + nomes.isEmpty());

        //limpa a lista
        //nomes.clear();
        //System.out.println("Lista: "+ nomes);

        //retorna o index do elemento na lista (se não encontra retorna o -1)
        System.out.println("O indice de Sofie na lista: " + nomes.indexOf("Sofie"));

        //percorrer a lista
        for (String nome: nomes)
            System.out.println(nome);

        System.out.println("//////////");

        Iterator<String> iterator = nomes.iterator();
        //hasNext -  boolean informa se tem mais um na frente
        //next - retorna o objeto que está iterando no momento
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
