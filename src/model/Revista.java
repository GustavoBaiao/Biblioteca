package model;

import enums.Periodicidade;

public class Revista  extends Item{
    private Integer numeroEdicao;
    private Periodicidade periodicidade;

    public Revista(Long id, String titulo, Integer anoPublicacao, Boolean disponivel, Integer numeroEdicao, Periodicidade periodicidade) {
        super(id, titulo, anoPublicacao, disponivel);
        this.numeroEdicao = numeroEdicao;
        this.periodicidade = periodicidade;
    }

    public Integer getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(Integer numeroEdicao) {
        if (numeroEdicao == null || numeroEdicao <= 0) {
            throw new IllegalArgumentException("O número da edição deve ser maior que zero");
        }
        this.numeroEdicao = numeroEdicao;
    }

    public Periodicidade getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(Periodicidade periodicidade) {
        this.periodicidade = periodicidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + getTitulo() + "\n"
                + "Numero de Edição: " + getNumeroEdicao() + "\n"
                + "Periodicidade: " + getPeriodicidade() + "\n"
                + "Ano de publicacao: " + getAnoPublicacao() + "\n"
                + "Disponivel: " + (isDisponivel() ? "Sim" : "Não"));
    }
}
