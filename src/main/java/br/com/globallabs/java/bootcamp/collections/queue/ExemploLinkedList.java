package br.com.globallabs.java.bootcamp.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        //poll - retorna o primeiro elemento e remove da fila
        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);

        //peek - retorna o primeiro elemento e não remove da fila, se estiver vazia, gera um null
        String primeiroCliente = filaDeBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        //filaDeBanco.clear();
        String primeiroClienteFilaVazia = filaDeBanco.peek();
        System.out.println(primeiroClienteFilaVazia);

        //element - retorna o primeiro elemento e não remove da fila, se estiver vazia, gera uma exception
       String clienteDaFila = filaDeBanco.element();
       System.out.println(clienteDaFila);
       System.out.println(filaDeBanco);

       for (String cliente: filaDeBanco)
           System.out.println(cliente);

        Iterator<String> iterator = filaDeBanco.iterator();
       while (iterator.hasNext())
           System.out.println(iterator.next());

        System.out.println("Quantos elementos: " + filaDeBanco.size());
        System.out.println("A lista está vazia? " + filaDeBanco.isEmpty());

        //erro de compilação
        //Collections.sort(filaDeBanco);

    }
}
