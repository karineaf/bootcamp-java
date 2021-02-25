package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4};

        //paradgma funcional
        Arrays.stream(valores)
                .filter(numero -> numero%2 == 0)
                .map(numero -> numero*2)
                .forEach(numero -> System.out.println(numero));

        //paradgma imperativo
        for (int valor : valores) {
            int valor1 = 0;
            if (valor % 2 == 0)
                valor1 = valor * 2;

            if (valor1 != 0)
                System.out.println(valor1);
        }

    }
}
