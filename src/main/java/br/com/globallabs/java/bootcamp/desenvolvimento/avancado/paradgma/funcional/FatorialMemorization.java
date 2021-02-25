package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemorization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        System.out.println(fatorialComMemorization(30));
        long fim = System.nanoTime();
        System.out.println("Fatorial 1 " + (fim-inicio));

        inicio = System.nanoTime();
        System.out.println(fatorialComMemorization(30));
        fim = System.nanoTime();
        System.out.println("Fatorial 2 " + (fim-inicio));

    }

    public static Integer fatorialComMemorization(Integer valor){

        if(valor==1)
            return valor;
        else {
            if (MAPA_FATORIAL.containsKey(valor))
                return MAPA_FATORIAL.get(valor);
            else{
                Integer resultado = valor * fatorialComMemorization(valor-1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}

