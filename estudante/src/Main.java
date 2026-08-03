package src;

import entities.Estudante;

import java.util.Locale;

public class Main {
    static void main(String[] args) {

    }

    public Estudante[] estudantesAprovados(Estudante[] estudantes){
        Estudante[] retorno = new Estudante[estudantes.length];
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i].calculaMedia() >= 6){
                retorno[i] = estudantes[i];
            }
        }
    }
}
