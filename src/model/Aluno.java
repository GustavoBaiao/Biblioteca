package model;

import java.util.List;

public class Aluno extends Pessoa {
    private Integer matricula;
    private String curso;

    public Aluno(Long id, String nome, String email, String telefone, Integer limiteEmprestimos, List<Emprestimo> emprestimosAtivos, Integer matricula, String curso) {
        super(id, nome, email, telefone, limiteEmprestimos, emprestimosAtivos);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean podeRealizarEmprestimo() {
        return getEmprestimosAtivos().size() < getLimiteEmprestimos();
    }

}
