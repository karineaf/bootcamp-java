package br.com.globallabs.java.bootcamp.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//foi criada para melhorar performance, mas não garante ordem
// não possui metodo set
public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        for (Double notaIndividual : notasAlunos)
            System.out.println(notaIndividual);

        notasAlunos.clear();

        System.out.println("A lista está vazia? " + notasAlunos.isEmpty());

    }
}
