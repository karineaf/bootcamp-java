package br.com.globallabs.java.bootcamp.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);
        System.out.println(campeoesMundialFifa);

        //atualiza o valor de acordo com a chave passada
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //retorna o valor de acordo com a chave passada
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //retorna se contém a chave passada
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //retorna se contém o valor passado
        System.out.println(campeoesMundialFifa.containsValue(1));

        //remove um registro
        campeoesMundialFifa.remove("França");

        System.out.println("Tamanho do map: " + campeoesMundialFifa.size());

        //entryset - retorna o set do objeto entry (entry: possui metodos como getKey, setKey, getValue, equals e etc)
        for (Map.Entry<String, Integer> pais : campeoesMundialFifa.entrySet())
            System.out.println(pais.getKey() + " - " + pais.getValue());

        //keyset - retorna um set do tipo especificado (nesse caso é string), então pega o valor de acordo com a chave
        for (String chave : campeoesMundialFifa.keySet())
            System.out.println(chave + " - " + campeoesMundialFifa.get(chave));

        campeoesMundialFifa.clear();
        System.out.println("Tamanho do map após clear: " + campeoesMundialFifa.size());

        System.out.println("O map está vazio? " + campeoesMundialFifa.isEmpty());



    }
}
