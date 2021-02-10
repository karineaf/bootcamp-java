package br.com.globallabs.java.bootcamp.map;

import java.util.Hashtable;
import java.util.Map;

//pode ser utilizado em ambientes que possui concorrência de threads - porém é obsoleto.
public class ExemploHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Mônica", 30);
        estudantes.put("Fernando", 27);
        estudantes.put("Pedro", 44);
        System.out.println(estudantes);

        //altera o valor de acordo com a chave, ou seja, não da pra ter dois com a mesma chave
        estudantes.put("Pedro", 36);
        System.out.println(estudantes);

        estudantes.remove("Pedro");
      //estudantes.remove("Pedro", 36);
        System.out.println("Retirando Pedro: " + estudantes);

        Integer idadeEstudante = estudantes.get("Mariana");
        System.out.println("Idade dx estudante: " + idadeEstudante);

        System.out.println("O tamanho do HashTable: " + estudantes.size());

        for (Map.Entry<String, Integer> estudante : estudantes.entrySet())
            System.out.println(estudante.getKey() + " - " + estudante.getValue());

        for (String chaveEstudante : estudantes.keySet())
            System.out.println(chaveEstudante + " = " + estudantes.get(chaveEstudante));


    }
}
