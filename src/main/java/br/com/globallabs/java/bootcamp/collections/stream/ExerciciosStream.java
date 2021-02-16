package br.com.globallabs.java.bootcamp.collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExerciciosStream {
    public static void main(String[] args) {
        //Utilizando uma lista com um objeto complexo realize as seguintes operações
        //  * transforme cada paciente em uma string com os atributos do objeto
        //  * conte a quantidade de pacientes da coleção
        //  * filter pacientes com idade >= a 18 anos
        //  * exiba cada elemento no console
        //  * retorne estudantes com nome que possui a letra H
        //  * retorne se existe ao menos um estudante com a letra D no nome
        //  * retorne o estudante + velho da coleção
        //  * retorne o estudante + novo da coleção

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Karine", 22, "Gastrite"));
        pacientes.add(new Paciente("Sofie", 18, "Cefaleia"));
        pacientes.add(new Paciente("Telma", 58, "Fibromialgia"));
        pacientes.add(new Paciente("Andressa", 28, "Distrofia"));
        pacientes.add(new Paciente("Adelcio", 62, "Pressão alta"));
        pacientes.add(new Paciente("Matheus", 19, "Bronquite"));
        pacientes.add(new Paciente("Hellen", 21, "Rinite"));
        pacientes.add(new Paciente("Maria Eduarda", 06, "Problema no pulmão"));

        List<String> pacienteList = new ArrayList<>();
        pacienteList = pacientes.stream().map(Paciente::toString).collect(Collectors.toList());
        pacienteList.forEach(System.out::println);

        System.out.println("Quantidade de pacientes: " + pacientes.stream().count());

        System.out.println("Pacientes com idade >= 18: " + pacientes.stream().filter(paciente -> paciente.getIdade() >= 18).collect(Collectors.toList()));

        System.out.println("Todos pacientes: " + pacientes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Pacientes que possuem a letra H: " + pacientes.stream().filter(paciente -> paciente.getNome().toLowerCase(Locale.ROOT).contains("h")).collect(Collectors.toList()));

        System.out.println("Existe algum paciente com a letra D? " + pacientes.stream().anyMatch(paciente -> paciente.getNome().toLowerCase(Locale.ROOT).contains("d")));

        System.out.println("Paciente mais velho: " + pacientes.stream().max(Comparator.comparing(Paciente::getIdade)).get());

        System.out.println("Paciente mais novo: " + pacientes.stream().min(Comparator.comparing(Paciente::getIdade)).get());

    }
}
