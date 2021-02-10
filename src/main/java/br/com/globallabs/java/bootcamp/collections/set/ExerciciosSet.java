package br.com.globallabs.java.bootcamp.collections.set;

import java.util.LinkedHashSet;

public class ExerciciosSet {
    public static void main(String[] args) {

        //Crie um set e execute as seguintes operações:
        //  * adicione 5 números inteiros: 3, 88, 20, 44, 3
        //  * navegue no set exibindo cada número no console
        //  * remova o 1º item do set.
        //  * adicione um novo número no set: 23
        //  * verifique o tamanho do set
        //  * verifique se o set está vazio

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (Integer numero : numeros)
            System.out.println(numero);

        numeros.remove(3);

        numeros.add(23);

        System.out.println("O tamanho da lista é de: " + numeros.size());

        System.out.println("A lista está vazia: " + numeros.isEmpty());

    }
}
