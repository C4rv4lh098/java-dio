package edu.rodrigo.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMain {
    public static void main(String[] args) {
        List<Temperatura> temperaturas = new ArrayList<>(){{
            add(new Temperatura(1,36.5));
            add(new Temperatura(2,40d));
            add(new Temperatura(3,25d));
            add(new Temperatura(4,20.6));
            add(new Temperatura(5,30d));
            add(new Temperatura(6,15.6));
        }};

        //Armazenar as médias em uma lista ✔
        System.out.println("\n=== Temperatura Semestral ===");
        Iterator<Temperatura> iterator = temperaturas.iterator();
        for (Temperatura media : temperaturas) {
            System.out.println(media);
        }
        System.out.println("==============================");

        //Calcule a média semestral das temperaturas ✔
        System.out.println("\n=== Média Semestral das Temperaturas ===");
        Double soma = 0d;
        while(iterator.hasNext()){
            Temperatura next = iterator.next();
            soma += next.getMedia();
        }
        //Double mediaSemestral = (soma/6);
        Double mediaSemestral = (soma/temperaturas.size());
        System.out.println("Soma das Média das Temperaturas: " + soma);
        System.out.println("Média Semestral: " + mediaSemestral);
        System.out.println("=========================================");

        //Temperaturas acima da média ✔
        //Mês por extenso em que as temperaturas acima da média ocorreram ✔
        System.out.println("\n=== Temperaturas Acima da Média Semestral ===");
        Iterator<Temperatura> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()){
            Temperatura next = iterator1.next();
            if(next.getMedia() > mediaSemestral){
                switch (next.getMes()){
                    case 1:
                        System.out.println("MÊS: Janeiro, MÉDIA: " + next.getMedia());
                        break;
                    case 2:
                        System.out.println("MÊS: Fevereiro, MÉDIA: " + next.getMedia());
                        break;
                    case 3:
                        System.out.println("MÊS: Março, MÉDIA: " + next.getMedia());
                    case 4:
                        System.out.println("MÊS: Abril, MÉDIA: " + next.getMedia());
                        break;
                    case 5:
                        System.out.println("MÊS: Maio, MÉDIA: " + next.getMedia());
                        break;
                    case 6:
                        System.out.print("MÊS: Junho, MÉDIA: " + next.getMedia());
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                        break;
                }
                //System.out.println(next);
            };
        }
        System.out.println("=============================================");
    }
}
