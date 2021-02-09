package br.com.globallabs.exemplomaven.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosQueue {
    public static void main(String[] args) {

        //Crie uma fila e execute as seguintes operações:
        //  * adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        //  * navegue na lista exibindo cada nome no console
        //  * retorne o 1º item da fila, sem removê-lo
        //  * retorne o 1º item da fila, removendo o mesmo
        //  * adicione um nove nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
        //  * retorne o tamanho da lisa.
        //  * verifique se a lista está vazia.
        //  * verifique se o nomes Carlos está na lista.

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes)
            System.out.println(nome);

        System.out.println(nomes.element());
        System.out.println(nomes);

        System.out.println(nomes.poll());
        System.out.println(nomes);
        
        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println("A lista está vazia? " + nomes.isEmpty());

        System.out.println("Carlos está na lista?  " + nomes.contains("Carlos"));
    }
}
