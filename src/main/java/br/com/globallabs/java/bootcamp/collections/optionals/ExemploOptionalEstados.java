package br.com.globallabs.java.bootcamp.collections.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor opcional que está presente");
        //primeiro argumento:expressão lambda que deve ser executada se o valor estiver presente = (valor) -> sout(valor)
        //segundo argumento: executa o que estiver dentro da expressão
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        //
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente"));

        //constrói optional vazio
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente"));


        //Optional.of ñ recebe null(dá erro). Logo, se é possível que a entrada seja nula, usar o ofNullable que transforma em vazio.
    }
}
