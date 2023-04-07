package edu.rodrigo.basico.metodos;

public class SistemaSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void status(){
        System.out.println("\n===== STATUS =====");
        System.out.println("TV Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("==================\n");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo Canal!");
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal + 1");
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal - 1");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume + 1");
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume - 1");
    }

    public void ligar(){
        ligada = true;
        System.out.println("LIGANDO...");
    }

    public void desligar(){
        ligada = false;
        canal = 0;
        volume = 0;
        System.out.println("DESLIGANDO...");
    }
}
