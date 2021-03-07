package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.processamento.assincrono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//utilizado quando se trata de grandes processamentos
public class ParallelStreams {
    public static void main(String[] args) {
        //Serial
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial: " + (fim-inicio));

        //Parallel
        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(ParallelStreams::fatorial);
        //IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel: " + (fim-inicio));

        List<String> nomes = Arrays.asList("Karine", "Antunes", "Farias");
        nomes.parallelStream().forEach(System.out::println);
        
        //ou seja, serve tanto para quando colocar como stream quanto como list

    }

    public static long fatorial(long num){
        int fat = 1;
        for (int i=2; i<=num; i++) {
            fat *= i;
        }
        return fat;
    }


}
