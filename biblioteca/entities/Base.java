package entities;

abstract class Base {
    private String titulo;

    public Base(String titulo) {
        this.titulo = titulo;
    }

    public Base() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
