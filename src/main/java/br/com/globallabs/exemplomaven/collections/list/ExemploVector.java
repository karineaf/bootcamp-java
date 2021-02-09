package br.com.globallabs.exemplomaven.collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Vôleibol");
        esportes.add("Slackline");
        esportes.add("Handebol");
        esportes.add("Basquetebol");
        esportes.add("Natação");
        esportes.add("Atletismo");

        esportes.set(3, "Futebol");

        esportes.remove(4);
        esportes.remove("Futebol");

        System.out.println(esportes.get(0));

        for (String esporte: esportes)
            System.out.println(esporte);




    }
}
