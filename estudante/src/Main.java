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

        System.out.println(Arrays.toString(estudantesAprovados(array)));
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
