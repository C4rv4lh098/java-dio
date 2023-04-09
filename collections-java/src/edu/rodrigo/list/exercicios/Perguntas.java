package edu.rodrigo.list.exercicios;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Perguntas {

    public List<Integer> Questionario(List<Integer> listaRespostas){
        Scanner scan = new Scanner(System.in);
        int resp = 0;

        System.out.println("\nResponda 1 para SIM e 0 para NÃO");
        System.out.println("1 - Telefonou para a vítima? ");
        System.out.print("Resposta: ");
        resp = scan.nextInt();
        listaRespostas.add(resp);
        System.out.println("\nResponda 1 para SIM e 0 para NÃO");
        System.out.println("2 - Esteve no local do crime? ");
        System.out.print("Resposta: ");
        resp = scan.nextInt();
        listaRespostas.add(resp);
        System.out.println("\nResponda 1 para SIM e 0 para NÃO");
        System.out.println("3 - Mora perto da vítima? ");
        System.out.print("Resposta: ");
        resp = scan.nextInt();
        listaRespostas.add(resp);
        System.out.println("\nResponda 1 para SIM e 0 para NÃO");
        System.out.println("4 - Devia para a vítima? ");
        System.out.print("Resposta: ");
        resp = scan.nextInt();
        listaRespostas.add(resp);
        System.out.println("\nResponda 1 para SIM e 0 para NÃO");
        System.out.println("5 - Ja trablhou com a vítima? ");
        System.out.print("Resposta: ");
        resp = scan.nextInt();
        listaRespostas.add(resp);

        return listaRespostas;
    }

    public String verificar(List<Integer> listaRespostas){
        String Classificao = "Inocente";
        Iterator<Integer> iterator = listaRespostas.iterator();
        int possitivo = 0;
        int negativo = 0;

        while(iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 1){
                possitivo++;
            }
            else{
                negativo++;
            }
        }

        System.out.println("\n=== Contagem das Respostas ===");
        System.out.println("Respostas Positivas: " + possitivo);
        System.out.println("Respostas Negativas: " + negativo);
        System.out.println("==============================");

        if (possitivo == 2){
            Classificao = "Suspeita";
        }
        if (possitivo >= 3){
            Classificao = "Cúmplice";
        }
        if (possitivo == 5){
            Classificao = "Assassina";
        }

        return Classificao;
    }

}

