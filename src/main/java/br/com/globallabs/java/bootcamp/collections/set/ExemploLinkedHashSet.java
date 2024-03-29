package br.com.globallabs.java.bootcamp.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

// permanece na ordem que foi inserida, performance um pouco pior
// não possui metodo set
public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(32);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        for (Integer numero : sequenciaNumerica)
            System.out.println(numero);

        System.out.println("A lista está vazia? " + sequenciaNumerica.isEmpty());

    }
}
