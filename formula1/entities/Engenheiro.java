package formula1.entities;

public class Engenheiro extends Pessoa{
    private Piloto piloto;

    public Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto) {
        super(nome, idade, nacionalidade);
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "\n\tnome=" + nome +
                "\n\tidade=" + idade +
                "\n\tnacionalidade=" + nacionalidade +
                "\n\tpiloto=" + piloto +
                "\n}";
    }
}
