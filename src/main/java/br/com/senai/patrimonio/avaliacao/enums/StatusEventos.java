package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEventos {
    EVENTO_PLANEJADO("Evento Planejado", 5),
    INSCRICOES_ABERTAS("Inscricoes Abertas", 10),
    EVENTO_EM_ANDAMENTO("Evento En Evento", 15),
    EVENTO_ENCERRADO("Evento Encerrado", 20),
    EVENTO_CANCELADO("Evento Cancelado", 25);

    private final String descricao;
    private final int codigo;

    StatusEventos(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
