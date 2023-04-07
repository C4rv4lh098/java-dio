package edu.rodrigo.exercicio1.calculadora;

public class Calculadora {

    public void resultado(String operacao, int resposta){
        System.out.println("O resultado da " + operacao + " é: " + resposta);
    }

    public void soma(int valor1, int valor2){
        int valorResultado = valor1 + valor2;
        resultado("Soma", valorResultado);
    }

    public void subtracao(int valor1, int valor2){
        int valorResultado = valor1 - valor2;
        resultado("Subtração", valorResultado);
    }

    public void multiplicacao(int valor1, int valor2){
        int valorResultado = valor1 * valor2;
        resultado("Multipliação", valorResultado);
    }

    public void divisao(int valor1, int valor2){
        int valorResultado = valor1 / valor2;
        resultado("Divisão", valorResultado);
    }
}
