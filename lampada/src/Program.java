package lampada.src;

import lampada.entities.Lampada;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Estado da lâmpada (0 = desligada | 1 = ligada): ");
        int aux = sc.nextInt();
        boolean ligada = (aux != 0);

        System.out.print("Watts (-1 = valor padrão): ");
        int watts = sc.nextInt();

        //instancia uma lâmpada
        Lampada lamp = new Lampada(ligada, watts);

        //chama o método da lâmpada
        lamp.exibe();
        
        sc.close();
    }
}
