package edu.rodrigo.set.exercicios;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OdenacaoLinguagem {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemOrdenada  = new LinkedHashSet<>();
        linguagemOrdenada.add(new LinguagemFavorita("Java", 1991, "Intelij"));
        linguagemOrdenada.add(new LinguagemFavorita("JavaScript", 1995, "WebStorm"));
        linguagemOrdenada.add(new LinguagemFavorita("Python", 1991, "PyCharme"));

        //Ordem de Inserção ok
        System.out.println("\nOrdem de Inserção: ");
        for (LinguagemFavorita linguagem: linguagemOrdenada) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("=============================");

        //Ordem Natural (nome) ok
        System.out.println("\nOrdenação pelo Nome: ");
        Set<LinguagemFavorita> linguagemOrdenada2 = new TreeSet<>(linguagemOrdenada);
        for (LinguagemFavorita linguagem: linguagemOrdenada2) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("=============================");

        //IDE ok
        System.out.println("\nOrdenação pela IDE: ");
        Set<LinguagemFavorita> linguagemOrdenada3 = new TreeSet<>(new ComparatorIDE());
        linguagemOrdenada3.addAll(linguagemOrdenada);
        for (LinguagemFavorita linguagem: linguagemOrdenada3) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("=============================");

        //Ano de criação e nome ok
        System.out.println("\nOrdenação pelo Ano de Ciração e Nome: ");
        Set<LinguagemFavorita> linguagemOrdenada4 = new TreeSet<>(new ComparatorAnoNome());
        linguagemOrdenada4.addAll(linguagemOrdenada);
        for (LinguagemFavorita linguagem: linguagemOrdenada4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("=============================");

        //Nome, ano de criacao e IDE
        System.out.println("\nOrdenação Nome, Ano de Criação e IDE: ");
        Set<LinguagemFavorita> linguagemOrdenada5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemOrdenada5.addAll(linguagemOrdenada);
        for (LinguagemFavorita linguagem: linguagemOrdenada5) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("=============================");
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        return linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int anoDeCraicao = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if(anoDeCraicao != 0){
            return anoDeCraicao;
        }

        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
        if(nome != 0){
            return nome;
        }

        int anoDeCraicao = Integer.compare(linguagem1.getAnoDeCriacao(), (linguagem2.getAnoDeCriacao()));
        if(anoDeCraicao != 0){
            return anoDeCraicao;
        }

        return linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
    }
}