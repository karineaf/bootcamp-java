package br.com.globallabs.java.bootcamp.collections.comparators;

import java.util.Comparator;

public class Cliente implements Comparable<Cliente> {

    private final String nome;
    private final Integer idade;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.getIdade() - cliente.getIdade();
    }
}
