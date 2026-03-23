package entities;

public class Patrocinador {
    private String nome;
    private double valorPat;

    public Patrocinador(String nome, double valorPat) {
        this.nome = nome;
        this.valorPat = valorPat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPat() {
        return valorPat;
    }

    public void setValorPat(double valorPat) {
        this.valorPat = valorPat;
    }

    @Override
    public String toString() {
        return "Patrocinadores{" +
                "nome='" + nome + '\'' +
                ", valorPat=" + valorPat +
                '}';
    }
}

