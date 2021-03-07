package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

import java.util.function.Consumer;

//java.util.funcion = classe já pronta para usar funcoes lambda
//Consumer recebe um parametro. mas não tem retorno
public class Consumidor {
    public static void main(String[] args) {

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);

        imprimirUmaFrase.accept("Hello Word");
        imprimirUmaFrase2.accept("Hello Word");



    }
}
