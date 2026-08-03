package formula1.entities;

public class CarroF1 {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;

    public CarroF1(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "CarroF1{" +
                "\n\tnumero=" + numero +
                "\n\tposicao=" + posicao +
                "\n\tequipe=" + equipe +
                "\n\tpiloto=" + piloto +
                "\n}";
    }
}
