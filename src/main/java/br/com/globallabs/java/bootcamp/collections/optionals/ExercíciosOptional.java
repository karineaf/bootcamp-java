package br.com.globallabs.java.bootcamp.collections.optionals;

import java.util.Optional;

public class ExercíciosOptional {
    public static void main(String[] args) {

        //Crie um optional de um determinado tipo de dado
        //  * crie com estado vazio, estado presente e com null
        //  * se presente, exiba o valor no console
        //  * se vazio, lance uma exceção IlegalStateException
        //  * se vazio, exiba "Optional vazio" no console
        //  * Se presente, transforme o valor e exiba no console
        //  * Se presente, pegue o valor do optional e atribua em uma variavel
        //  * Se presente, filtre o optional com uma determinada regra de negócio

        Optional<String> optionalVazio = Optional.empty();
        Optional<String> optionalPresente = Optional.of("Valor presente no optional");
        Optional<String> optionalNull = Optional.ofNullable(null);

        optionalVazio.ifPresent(System.out::println);
        optionalPresente.ifPresent(System.out::println);
        optionalNull.ifPresent(System.out::println);

//        optionalVazio.orElseThrow(IllegalStateException::new);
//        optionalPresente.orElseThrow(IllegalStateException::new);
//        optionalNull.orElseThrow(IllegalStateException::new);

        optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
        optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        optionalVazio.map((valor) -> valor.replace("Valor presente no optional", "Novo valor para optional")).ifPresent(System.out::println);
        optionalPresente.map((valor) -> valor.replace("Valor presente no optional", "Novo valor para optional")).ifPresent(System.out::println);
        optionalNull.map((valor) -> valor.replace("Valor presente no optional", "Novo valor para optional")).ifPresent(System.out::println);

        String variavel = "seila";
        if(optionalVazio.isPresent())
            variavel=optionalVazio.get();
        System.out.println(variavel);

        if(optionalVazio.isPresent())
            variavel=optionalPresente.get();
        System.out.println(variavel);

        if(optionalVazio.isPresent())
            variavel=optionalNull.get();
        System.out.println(variavel);






    }
}
