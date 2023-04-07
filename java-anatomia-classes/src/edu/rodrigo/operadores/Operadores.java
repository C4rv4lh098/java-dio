package edu.rodrigo.basico.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("1º Valor variavel: " + numero);

        System.out.println("2º Valor variavel: " + - numero);

        System.out.println("3º Valor variavel: " + numero);

        numero = - numero;

        System.out.println("4º Valor variavel: " + numero);

        numero = + numero;

        System.out.println("5º Valor variavel: " + numero);

        numero = numero * -1;

        System.out.println("6º Valor variavel: " + numero);
    }
}
