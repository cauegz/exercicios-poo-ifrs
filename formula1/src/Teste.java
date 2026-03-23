package src;

import entities.CarroF1;
import entities.Equipe;
import entities.Patrocinador;
import entities.Piloto;

public class Teste {
    public static void main(String[] args) {

        Patrocinador p1 = new Patrocinador("nike", 10000);
        Patrocinador p2 = new Patrocinador("adidas", 20000);
        Patrocinador p3 = new Patrocinador("sadia", 2000);

        Equipe eqp = new Equipe("McLaren", 1901);
        eqp.addPatrocinador(p1);
        eqp.addPatrocinador(p2);
        eqp.addPatrocinador(p3);

        Piloto plt = new Piloto("Juninho", 30, "Brasileiro");
        CarroF1 carF1 = new CarroF1(10, 1, eqp, plt);

        System.out.println(carF1);
        System.out.println(plt);
        System.out.println(eqp);
    }
}
