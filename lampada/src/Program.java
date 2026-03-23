package src;

import entities.Lampada;

public class Program {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(true);

        lamp.interruptor();

        lamp.exibe();
    }
}
