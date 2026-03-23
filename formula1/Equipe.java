import java.util.Arrays;

public class Equipe {
    private String nome;
    private int anoFund;
    private Patrocinadores[] patrocinadores;

    public Equipe(String nome, int anoFund, Patrocinadores[] patrocinadores) {
        this.nome = nome;
        this.anoFund = anoFund;
        this.patrocinadores = patrocinadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFund() {
        return anoFund;
    }

    public void setAnoFund(int anoFund) {
        this.anoFund = anoFund;
    }

    public Patrocinadores[] getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(Patrocinadores[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "nome='" + nome + '\'' +
                ", anoFund=" + anoFund +
                ", patrocinadores=" + Arrays.toString(patrocinadores) +
                '}';
    }
}
