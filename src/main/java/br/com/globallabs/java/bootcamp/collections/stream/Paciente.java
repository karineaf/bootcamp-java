package br.com.globallabs.java.bootcamp.collections.stream;

public class Paciente implements Comparable<Paciente>{

    private final String nome;
    private final Integer idade;
    private final String diagnostico;

    public Paciente(String nome, Integer idade, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getDiagnóstico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " - " + diagnostico;
    }

    @Override
    public int compareTo(Paciente paciente) {
        return this.getIdade() - paciente.getIdade();
    }
}
