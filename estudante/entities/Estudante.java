package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insira a nota " + (i+1) + ": ");
            String texto = sc.nextLine().replace(',', '.');
            notas[i] = Double.parseDouble(texto);
        }
    }

    public double calculaMedia(){
        return Arrays.stream(notas).average().orElse(0);
    }

    public double menorNota(){
        return Arrays.stream(notas).min().orElse(0);
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
