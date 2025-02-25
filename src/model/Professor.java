package model;

import java.util.List;

public class Professor extends Pessoa{
    private String departamento;

    public Professor(Long id, String nome, String email, String telefone, Integer limiteEmprestimos, List<Emprestimo> emprestimosAtivos, String departamento) {
        super(id, nome, email, telefone, limiteEmprestimos, emprestimosAtivos);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean podeRealizarEmprestimo() {
        return getEmprestimosAtivos().size() < getLimiteEmprestimos();
    }

}
