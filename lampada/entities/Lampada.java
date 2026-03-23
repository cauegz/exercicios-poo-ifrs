package entities;

public class Lampada {
    private boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void interruptor(){
        ligada = !ligada;
        // true = !true
        // false

        // false = !false
        // true
    }

    public void exibe() {
        if(ligada){
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada !está acesa.");
        }
    }
}
