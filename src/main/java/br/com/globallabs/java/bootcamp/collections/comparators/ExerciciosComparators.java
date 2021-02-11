package br.com.globallabs.java.bootcamp.collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciciosComparators {
    public static void main(String[] args) {

        //Crie uma lista de um objeto complexo e execute as seguintes operações:
        //  * adicione elementos nessa lista
        //  * ordene  implementando a interface Comparator no seu objeto complexo
        //  * ordene implementando um novo objeto com a interface Comparable
        //  * ordene usando uma expressão lambda na chamada de suaLista.sort()
        //  * ordene usando referências de métodos e os métodos estáticos do Comparator
        //  * remova o nome João.
        //  * retorne a quantidade de itens na lista
        //  * verifique se o nome Juliano existe na lista.
        //  * crie uma nova lista com novos nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na 1ª lista criada
        //  * ordene os itens da lista por ordem alfabética.
        //  * verifique se a lista está vazia.

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Karine", 22));
        clientes.add(new Cliente("Sofie", 18));
        clientes.add(new Cliente("Pedro", 22));
        clientes.add(new Cliente("Hellen", 21));
        clientes.add(new Cliente("Andressa", 28));
        clientes.add(new Cliente("Felipe", 25));
        clientes.add(new Cliente("Matheus", 19));
        System.out.println("Ordem de inserção: " + clientes);

        clientes.sort(new ClienteOrdemReversaComparator());
        System.out.println("Ordem reversa com comparator: " +clientes);

        clientes.sort(Comparator.comparingInt(Cliente:: getIdade));
        System.out.println(clientes);

        clientes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordem natural com lambda: " +clientes);














    }
}
