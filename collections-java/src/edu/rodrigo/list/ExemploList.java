package edu.rodrigo.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(8.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));

        notas.add(4, 8d);
        System.out.println(notas);

        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Existe a nota 5.0: " + notas.contains(5d));

        for (Double nota :notas) {
            System.out.println(nota);
        }

        System.out.println("Terceira nota adicionada:" + notas.get(2));

        System.out.println("A menor nota: " + Collections.min(notas));

        System.out.println("A maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma de todass as notas: " + soma);

        System.out.println("Média das notas: " + (soma/notas.size()));

        notas.remove(0d);
        System.out.println(notas);

        notas.remove(0);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next< 7) iterator1.remove();
        }
        System.out.println(notas);

        notas.clear();

        System.out.println("Lista Vazia: " + notas.isEmpty());
    }
}
