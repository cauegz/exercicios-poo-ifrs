package entities;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private int anoFund;
    private final ArrayList<Patrocinador> patrocinadores = new ArrayList<>();

    public Equipe(String nome, int anoFund) {
        this.nome = nome;
        this.anoFund = anoFund;
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

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void addPatrocinador (Patrocinador patrocinador){
        patrocinadores.add(patrocinador);
    }

    public void removePatrocinador (Patrocinador patrocinador){
        patrocinadores.remove(patrocinador);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "\n\t\tnome='" + nome + '\'' +
                "\n\t\tanoFund=" + anoFund +
                "\n\t\tpatrocinadores=" + patrocinadores.toString() +
                "\n\t\t}";
    }
}
