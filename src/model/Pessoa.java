package model;

import java.util.List;

public abstract class Pessoa {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Integer limiteEmprestimos;
    List<Emprestimo> emprestimosAtivos;

    public Pessoa(Long id, String nome, String email, String telefone, Integer limiteEmprestimos, List<Emprestimo> emprestimosAtivos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.limiteEmprestimos = limiteEmprestimos;
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void setLimiteEmprestimos(Integer limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(List<Emprestimo> emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public abstract Boolean podeRealizarEmprestimo();
}