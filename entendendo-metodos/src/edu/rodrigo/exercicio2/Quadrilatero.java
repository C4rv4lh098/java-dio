package edu.rodrigo.exercicio2;

public class Quadrilatero {
    public void area(double lado){
        System.out.println("Área do Quadrado: " + lado * lado);
    }

    public void area(double lado1, double lado2){
        System.out.println("Área do Retânglo: " + lado1 * lado2);
    }

    public void area(double baseMenor, double baseMaior, double altura){
        System.out.println("Área do Trapézio: " + ((baseMenor + baseMaior) * altura) / 2);
    }

    public void area(float diagonal1, float diagonal2) {
        System.out.println("Área do Lozango: " + (diagonal1 * diagonal2) / 2);
    }
}
