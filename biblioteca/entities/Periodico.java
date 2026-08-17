package entities;

public class Periodico extends Base{
    private String numeroVolume;

    public Periodico(String titulo, String numeroVolume) {
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

    public String getNumeroVolume() {
        return numeroVolume;
    }

    public void setNumeroVolume(String numeroVolume) {
        this.numeroVolume = numeroVolume;
    }
}
