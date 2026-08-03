package entities;

public class Livro extends Base{
    private SituacaoLivro situacao = SituacaoLivro.DISPONIVEL;
    private boolean disponivel = true;

    public Livro(String titulo, SituacaoLivro situacao, boolean disponivel) {
        super(titulo);
        this.situacao = situacao;
        this.disponivel = disponivel;
    }

    public Livro(String titulo) {
        super(titulo);
    }

    public SituacaoLivro getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoLivro situacao) {
        this.situacao = situacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
