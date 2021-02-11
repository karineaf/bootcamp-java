package br.com.globallabs.java.bootcamp.collections.comparators;

import java.util.Comparator;

public class EstudanteOrdemReversaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante, Estudante estudante2) {
        return estudante2.getIdade() - estudante.getIdade();
    }
}
