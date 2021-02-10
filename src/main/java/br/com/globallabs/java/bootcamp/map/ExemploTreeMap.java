package br.com.globallabs.java.bootcamp.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> capitais = new TreeMap<>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");
        capitais.put("BA", "Salvador");
        System.out.println(capitais);

        System.out.println(capitais.firstKey());

        System.out.println(capitais.lastKey());

        // retorna a chave abaixo da chave escolhida
        System.out.println(capitais.lowerKey("RS"));
        // retorna a chave e valor abaixo da chave ecolhida
        System.out.println("lowerEntry: " + capitais.lowerEntry("RS"));

        // retorna a chave acima da chave escolhida
        System.out.println(capitais.higherKey("RS"));

        //retorna 1º elemento e retira da fila
        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();
        //retorna último elemento e retira da fila
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();
        System.out.println(capitais);

        Iterator<String> iterator = capitais.keySet().iterator();
        while (iterator.hasNext()) {
            String chave = iterator.next();
            System.out.println(chave + " - " + capitais.get(chave));
        }

        System.out.println("////////////");

        for (Map.Entry<String, String> capital : capitais.entrySet())
            System.out.println(capital);

        System.out.println("////////////");

        for(String chave : capitais.keySet())
            System.out.println(chave + " - " + capitais.get(chave));

    }
}
