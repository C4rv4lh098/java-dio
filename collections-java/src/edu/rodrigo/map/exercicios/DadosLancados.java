package edu.rodrigo.map.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DadosLancados {
    public static void main(String[] args) {
        Map<Integer, Integer> lancamentos = new HashMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        Random gerador = new Random();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;


        for(int i=0; i<100; i++){
            int numDado = gerador.nextInt(6)+1;

            switch (numDado){
                case 1:
                    cont1 +=1;
                    lancamentos.put(1, cont1);
                    break;
                case 2:
                    cont2 +=1;
                    lancamentos.put(2, cont2);
                    break;
                case 3:
                    cont3 +=1;
                    lancamentos.put(3, cont3);
                    break;
                case 4:
                    cont4 +=1;
                    lancamentos.put(4, cont4);
                    break;
                case 5:
                    cont5 +=1;
                    lancamentos.put(5, cont5);
                    break;
                case 6:
                    cont6 +=1;
                    lancamentos.put(6, cont6);
                default:
                    break;
            }
        }
        System.out.println("Quantidade de vezes que cada lado caiu:");
        System.out.println(lancamentos.toString());



    }
}
