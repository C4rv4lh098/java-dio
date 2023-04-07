package edu.rodrigo.basico.anatomiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Rodrigo";
        String segundoNome = "Moura";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Método " + primeiroNome + " " + segundoNome;
    }
}