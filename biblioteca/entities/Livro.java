package entities;

import static entities.SituacaoLivro.*;

public class Livro extends Base{
    private SituacaoLivro situacao = DISPONIVEL;

    public Livro(String titulo, SituacaoLivro situacao) {
        super(titulo);
        this.situacao = situacao;
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

    public boolean emprestar(){
        if(this.situacao != DISPONIVEL) return false;
        this.situacao = EMPRESTADO;
        return true;
    }
}
