package edu.rodrigo.exercicio2;

public class Main {
    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Quadrilatero();

        System.out.println("Exercício 3");

        quadrilatero.area(3);
        quadrilatero.area(5, 5);
        quadrilatero.area(7, 8, 9);
        quadrilatero.area(5f, 5f);
    }
}
