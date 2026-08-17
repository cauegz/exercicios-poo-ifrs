package src;

import entities.Estudante;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Estudante[] array = new Estudante[2];
        array[0] = new Estudante("joao");
        array[0].insereNotas();
        array[1] = new Estudante("maria");
        array[1].insereNotas();
        int[] pesos = new int[5];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = i+1;
        }
        System.out.println(Arrays.toString(estudantesAprovados(array)));
        System.out.println(array[0].calculaMedia(pesos));
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
