package src;

import entities.Livro;
import entities.Periodico;

import static entities.SituacaoLivro.*;

public class MainBiblioteca {
    static void main(String[] args) {
        //criar um livro, como default a situação é disponível
        Livro dracula = new Livro("dracula");

        //emprestar um livro
        System.out.println("------TESTE 1-----");
        if(dracula.emprestar()){
            System.out.println("Livro emprestado com sucesso");
        } else {
            System.out.println("Livro não pode ser emprestado");
        }

        //se tentar emprestar denovo o mesmo livro ele não deixa
        System.out.println("\n------TESTE 2-----");
        if(dracula.emprestar()){
            System.out.println("Livro emprestado com sucesso");
        } else {
            System.out.println("Livro não pode ser emprestado");
        }

        //como o periódico não tem o metodo emprestar() não tem como tentar emprestar
        Periodico periodico = new Periodico("impacto da ia na educação", "v. 12, n. 3");
        System.out.println("\n-----TESTE 3-----");
        System.out.println("Titulo: " + periodico.getTitulo());
        System.out.println("Número e volume: " + periodico.getNumeroVolume());
    }
}
