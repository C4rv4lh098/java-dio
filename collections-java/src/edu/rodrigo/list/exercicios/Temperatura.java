package edu.rodrigo.list.exercicios;

public class Temperatura {
    private int mes;
    private Double media;

    public Temperatura(int mes, Double media) {
        this.mes = mes;
        this.media = media;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "{" +
                "Mês = " + mes +
                ", Média = " + media +
                '}';
    }
}
