
package br.com.globallabs.java.bootcamp.collections.map;

import java.util.HashMap;

public class ExerciciosHashMap {
    public static void main(String[] args) {
        //Crie um map e execute as seguintes operações:
        //  * adicione os 26 estados brasileiros, onde sigla=chave e nome=valor
        //  * remova o estado de Minas Gerais
        //  * adicione o Distrito Federal
        //  * verifique o tamanho do map
        //  * remova o estado do Mato Grosso do Sul usando o nome
        //  * navegue em todos os registros do map, mostrando no console no seguinte formato = NOME(SIGLA)
        //  * verifique se o estado de Santana Catarina existe no map buscando por sua sigla (SC)

        HashMap<String, String> estados = new HashMap<>();
        estados.put("AC", "Acre");
        estados.put("TO", "Tocantins");
        estados.put("AL", "Alagoas");
        estados.put("SE", "Sergipe");
        estados.put("AP", "Amapá");
        estados.put("SP", "São Paulo");
        estados.put("AM", "Amazonas");
        estados.put("SC", "Santa Catarina");
        estados.put("BA", "Bahia");
        estados.put("RR", "Roraima");
        estados.put("CE", "Ceará");
        estados.put("RO", "Rondônia");
        estados.put("ES", "Espírito Santo");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("GO", "Goiás");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("MA", "Maranhão");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MT", "Mato Grosso");
        estados.put("PI", "Piauí");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("PE", "Pernambuco");
        estados.put("MG", "Minas Gerais");
        estados.put("PR", "Paraná");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraiba");
        System.out.println(estados);

        estados.remove("MG");
        System.out.println(estados);

        estados.put("DF", "Distrito Federal");
        System.out.println(estados);

        System.out.println("O tamanho do map é: " + estados.size());

        estados.remove("MA", "Maranhão");

        for (String chaveEstado : estados.keySet())
            System.out.println(estados.get(chaveEstado).toUpperCase() + "("+chaveEstado+")" );

        System.out.println("O estado de Santa Catarina está no map? "+ estados.containsKey("SC"));

        estados.put("AES", null);

        System.out.println(estados);

    }
}
