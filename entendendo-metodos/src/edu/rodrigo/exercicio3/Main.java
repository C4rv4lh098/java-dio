package edu.rodrigo.exercicio3;


public class Main {
    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Quadrilatero();

        System.out.println("Exercício 3");

        double areaQuadradro = quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadradro);

        double areaRetangulo = quadrilatero.area(5, 5);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = quadrilatero.area(7, 8, 9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        float areaLozango = quadrilatero.area(5f, 5f);
        System.out.println("Área do Lozango: " + areaLozango);
    }
}
