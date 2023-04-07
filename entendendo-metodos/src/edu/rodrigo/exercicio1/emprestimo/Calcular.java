package edu.rodrigo.exercicio1.emprestimo;

public class Calcular {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);
    }
}
