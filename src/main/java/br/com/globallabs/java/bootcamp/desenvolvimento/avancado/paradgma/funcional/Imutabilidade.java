package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        String valor = "hi";
        //deu erro pq a variavel já possui um valor
        //UnaryOperator<String> retornarODobro = valor -> valor + "olá";
        //System.out.println(retornarODobro.apply(valor));
        System.out.println(valor);

    }
}
