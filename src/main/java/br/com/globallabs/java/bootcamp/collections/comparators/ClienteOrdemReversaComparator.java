package br.com.globallabs.java.bootcamp.collections.comparators;

import java.util.Comparator;

public class ClienteOrdemReversaComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente, Cliente cliente2) {
        return cliente2.getIdade() - cliente.getIdade();
    }
}
