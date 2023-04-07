package edu.rodrigo.basico.metodos;

public class Usuario {
    public static void main(String[] args) {
        SistemaSmartTv smartTv = new SistemaSmartTv();

        smartTv.status();

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(15);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.diminuirCanal();

        smartTv.status();

        smartTv.desligar();

        smartTv.status();
    }
}
