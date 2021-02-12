package br.com.globallabs.java.bootcamp.collections.optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        //se estiver presente, mostra na linha de comando o que está no valor
        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

        if(optionalString.isPresent())
            //dá erro se estiver fora do if e ter valor = vazio
            System.out.println("condição if - " + optionalString.get());

        // concatena -- ao valor opcional e se estiver presente monstra no console
        optionalString.map((valor) -> valor.concat("--")).ifPresent(System.out::println);

        // ok se estiver presente, mas se não estiver, lança uma exceção
        optionalString.orElseThrow(IllegalStateException::new);



    }
}
