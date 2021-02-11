package br.com.globallabs.java.bootcamp.collections.comparators;

public class Estudante implements Comparable<Estudante> {

    private final String nome;
    private final Integer idade;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(Estudante estudante) {
        return this.getIdade() - estudante.getIdade();
    }
}
