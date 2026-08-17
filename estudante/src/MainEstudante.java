package src;

import entities.Estudante;

import java.util.Arrays;

public class MainEstudante {
    static void main(String[] args) {
        Estudante[] array = new Estudante[2];
        array[0] = new Estudante("joao");
        System.out.println("Insira as notas para o estudante " + array[0].getNome());
        array[0].insereNotas();
        array[1] = new Estudante("maria");
        System.out.println("Insira as notas para o estudante " + array[1].getNome());
        array[1].insereNotas();
        int[] pesos = new int[5];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = i+1;
        }
        System.out.println("\n--------------------------\nESTUDANTES APROVADOS\n--------------------------");
        Estudante[] aprovados = estudantesAprovados(array);
        for (int i = 0; i < aprovados.length; i++) {
            System.out.println((i+1) + " - " + aprovados[i]);
            System.out.print("\n--------------------------\n\n");
        }
        System.out.println("Média do estudante " + array[0].getNome() + ": ");
        System.out.print(array[0].calculaMedia(pesos));
        System.out.println("Média do estudante " + array[1].getNome() + ": ");
        System.out.println(array[1].calculaMedia(pesos));
    }

    public static Estudante[] estudantesAprovados(Estudante[] estudantes){
        Estudante[] retorno = new Estudante[estudantes.length];
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i].calculaMedia() >= 6){
                retorno[i] = estudantes[i];
            }
        }
        return retorno;
    }
}
