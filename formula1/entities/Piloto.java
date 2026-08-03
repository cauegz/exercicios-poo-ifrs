package formula1.entities;

public class Piloto extends Pessoa{

    private int numeroDeVitorias;

    public Piloto(String nome, int idade, String nacionalidade, int numeroDeVitorias) {
        super(nome, idade, nacionalidade);
        this.numeroDeVitorias = numeroDeVitorias;
    }

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t\tnome=" + nome +
                "\n\t\tnumeroDeVitorias='" + numeroDeVitorias +
                "\n\t\tidade=" + idade +
                "\n\t\tnacionalidade='" + nacionalidade +
                "\n}";
    }
}
