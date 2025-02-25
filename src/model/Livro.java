package model;

public class Livro extends Item {
    private String autor;
    private Integer numeroPaginas;
    private String isbn;

    public Livro(Long id, String titulo, Integer anoPublicacao, Boolean disponivel, Integer numeroPaginas, String autor, String isbn) {
        super(id, titulo, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getTitulo() + "\n"
        + "Autor: " + getAutor() + "\n"
        + "Numero de Paginas: " + getNumeroPaginas() + "\n"
        + "Ano de publicacao: " + getAnoPublicacao() + "\n"
        + "ISBN: " + getIsbn() + "\n"
        + "Disponivel: " + (isDisponivel() ? "Sim" : "Não"));
    }
}
