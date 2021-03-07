package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

import java.util.function.Predicate;

//recebe um parametro e retorna um boolean
public class Predicado {
    public static void main(String[] args) {
        Predicate<String> igualAKarine = valor -> valor.equals("Karine");
        System.out.println(igualAKarine.test(""));
        System.out.println(igualAKarine.test("Karine"));

        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Karine"));

    }
}
