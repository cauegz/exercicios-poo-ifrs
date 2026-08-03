package lampada.entities;

public class Lampada {
    //atributos
    private boolean ligada;
    private int watts;

    //construtor utilizado para definir os watts na criação do objeto
    public Lampada(boolean ligada, int watts) {
        this.ligada = ligada;
        if(watts < 0){
            this.watts = 60;
        } else {
            setWatts(watts);
        }
    }

    //construtor que define o valor padrão para os watts
    public Lampada(boolean ligada) {
        this.ligada = ligada;
        this.watts = 60;
    }

    //getters e setters

    //checa se a lâmpada está ligada
    public boolean isLigada() {
        return ligada;
    }

    //retorna a quantidade de watts da lâmpada
    public int getWatts() {
        return watts;
    }

    //set com validação entre 1 e 1000 watts
    public void setWatts(int watts) {
        if(watts<1){
            this.watts = 1;
        } else if (watts>1000) {
            this.watts = 1000;
        } else{
            this.watts = watts;
        }
    }

    //métodos

    //inverte o estado da lâmpada
    public void interruptor(){
        ligada = !ligada;
    }

    //mostra as informações da lâmpada
    public void exibe() {
        if(ligada){
            System.out.println("A lâmpada está acesa. \nE tem "+watts+" watts.");
        } else {
            System.out.println("A lâmpada !está acesa. \nE tem "+watts+" watts.");
        }
    }
}
