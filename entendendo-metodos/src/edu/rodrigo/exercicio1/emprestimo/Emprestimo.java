package edu.rodrigo.exercicio1.emprestimo;

public class Emprestimo {
    public int getDuasParcelas() {
        return 2;
    }

    public int getTresParcelas() {
        return 3;
    }

    public double getTaxaDuasParcelas() {
        return 0.3;
    }

    public double getTaxaTresParcelas() {
        return 0.45;
    }

    public void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }
        else{
            if (parcelas == 3) {

                double valorFinal = valor + (valor * getTaxaTresParcelas());

                System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
            }
            else {
                System.out.println("Quantidade de parcelas não aceita.");
            }
        }
    }
}
