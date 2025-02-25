package model;

public class DVD extends Item{
    private Integer duracao;
    private String diretor;

    public DVD(Long id, String titulo, Integer anoPublicacao, Boolean disponivel, Integer duracao, String diretor) {
        super(id, titulo, anoPublicacao, disponivel);
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }



    @Override
    public void exibirDetalhes() {
        System.out.println("DVD: " + getTitulo() + "\n"
                + "Diretor: " + getDiretor() + "\n"
                + "Duracao: " + getDuracao() + "\n"
                + "Ano: " + getAnoPublicacao() + "\n"
                + "Disponivel: " + (isDisponivel() ? "Sim" : "Não"));
    }
}
