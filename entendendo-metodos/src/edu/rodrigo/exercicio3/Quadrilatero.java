package edu.rodrigo.exercicio3;

public class Quadrilatero {
    public double area(double lado){
        return (lado * lado);
    }

    public double area(double lado1, double lado2){
        return (lado1 * lado2);
    }

    public double area(double baseMenor, double baseMaior, double altura){
        return (((baseMenor + baseMaior) * altura) / 2);
    }

    public float area(float diagonal1, float diagonal2) {
        return ((diagonal1 * diagonal2) / 2);
    }
}
