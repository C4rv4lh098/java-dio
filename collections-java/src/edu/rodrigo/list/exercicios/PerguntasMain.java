package edu.rodrigo.list.exercicios;


import java.util.ArrayList;
import java.util.List;

public class PerguntasMain {
    public static void main(String[] args) {
        String Resultado;
        Perguntas perguntas = new Perguntas();
        List<Integer> respostas = new ArrayList<>();

        respostas = perguntas.Questionario(respostas);
         Resultado = perguntas.verificar(respostas);
        System.out.println("\nVEREDITO: " + Resultado);
    }
}
