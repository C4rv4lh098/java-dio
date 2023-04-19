package edu.rodrigo.map.exercicios;

import java.util.*;

public class Estados {
    public static void main(String[] args) {
        //Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estados = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

       //Substitua a população do estado do RN por 3.534.165;
        System.out.println(estados.toString());
        System.out.println("\nSubstituindo a população de RN");
        estados.put("RN", 3534165);
        System.out.println(estados.toString());

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        System.out.println("\nVerificando se o Estado PB está no dicionário: " + estados.containsKey("PB"));
        estados.put("PB", 4039277);

        //Exiba a população PE;
        System.out.println("\nPopulação de PE: " + estados.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\nOrdem de Inserção: ");
        System.out.println(estados1.toString());

        //Exiba os estados e suas populações em ordem alfabética;
        System.out.println("\nOrdem Alfabética: ");
        System.out.println(estados.toString());

        //Exiba o estado com o menor população e sua quantidade;
        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenosPopuloso = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = entry.getKey();
                System.out.println("\nEstado com a Menor População: " + estadoMenosPopuloso + " - " + menorPopulacao);
            }
        }

        //Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(estados.values());
        String estadoMaisPopuloso = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaisPopuloso = entry.getKey();
                System.out.println("\nEstado com a Maior População: " + estadoMaisPopuloso + " - " + maiorPopulacao);
            }
        }

        //Exiba a soma da população desses estados;
        Collection<Integer> populacoes = estados.values();
        Integer soma = 0;
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nSoma das Populações: " + soma);

        //Exiba a média da população deste dicionário de estados;
        System.out.println("\nMédia da Populoação no dicionário: " + (soma/populacoes.size()));

        //Remova os estados com a população menor que 4.000.000;
        System.out.println("\nEstados com a população maior que 4.000.000");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados.toString());

        //Apague o dicionário de estados;
        estados.clear();

        //Confira se o dicionário está vazio.
        System.out.println("\nO dicionário foi esváziado? " + estados.isEmpty());
    }
}
