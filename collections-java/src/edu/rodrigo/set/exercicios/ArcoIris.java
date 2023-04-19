package edu.rodrigo.set.exercicios;


import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> rainbow = new LinkedHashSet<>();
        rainbow.add("Vemerlho");
        rainbow.add("Laranja");
        rainbow.add("Amarelo");
        rainbow.add("Verde");
        rainbow.add("Azul");
        rainbow.add("Anil");
        rainbow.add("Violeta");

        //Exiba todas as cores uma abaixo da outra
        System.out.println("\n=== Arco - Iris ===");
        for (String cores:rainbow) {
            System.out.println(cores);
        }
        System.out.println("====================");

        //A quantidade de cores que o arco-íris tem
        System.out.println("\nCores do Arco - Iris: " + rainbow.size() + " cores");
        System.out.println("===============================");

        //Exiba as cores em ordem alfabética
        Set<String> rainbowAlfa = new TreeSet<>(rainbow);
        System.out.println("\nCores do Arco - Iris em ordem Alfabética: ");
        System.out.println(rainbowAlfa);
        System.out.println("=========================================================");

        //Exiba as cores na ordem inversa da que foi informada
        System.out.println("\nCores na Ordem Inversas: ");
        List<String> reverseRainbow = new ArrayList<>(rainbow);
        Collections.reverse(reverseRainbow);
        System.out.println(reverseRainbow);
        System.out.println("=========================================================");

        //Exiba todas as cores que começam com a letra ”v”
        System.out.println("\nCores do Arco - Iris que começam com a letra 'V':");
        for (String cores: rainbow) {
            if (cores.startsWith("V")){
                System.out.println(cores);
            }
        }
        System.out.println("=================================================");

        //Remova todas as cores que não começam com a letra “v”
        System.out.println("\nCores do Arco - Iris sem as que começam com a letra 'V':");
        Iterator<String> iterator = rainbow.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("V")){
                iterator.remove();
            }
        }
        System.out.println(rainbow);
        System.out.println("=================================================");

        //Limpe o conjunto
        rainbow.clear();

        //Confira se o conjunto está vazio
        System.out.println("\nA lista foi esvaziada? " + rainbow.isEmpty());
    }
}
