package model;

import java.time.LocalDate;

public class Emprestimo {
    private Long id;
    private Item item;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevisaoDevolucao;
    private LocalDate dataDevolucao;

    public Emprestimo(Long id, Item item, Pessoa pessoa, LocalDate dataEmprestimo, LocalDate dataPrevisaoDevolucao, LocalDate dataDevolucao) {
        this.id = id;
        this.item = item;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevisaoDevolucao = dataPrevisaoDevolucao;
        this.dataDevolucao = dataDevolucao;

        if (dataDevolucao != null && dataDevolucao.isBefore(dataEmprestimo)) {
            throw new IllegalArgumentException("A data de devolução não pode ser anterior à data de empréstimo.");
        }
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevisaoDevolucao() {
        return dataPrevisaoDevolucao;
    }

    public void setDataPrevisaoDevolucao(LocalDate dataPrevisaoDevolucao) {
        this.dataPrevisaoDevolucao = dataPrevisaoDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        if (dataDevolucao != null && dataDevolucao.isBefore(dataEmprestimo)) {
            throw new IllegalArgumentException("A data de devolução não pode ser anterior à data de empréstimo.");
        }
        this.dataDevolucao = dataDevolucao;
    }

    public boolean estaAtrasado() {
        if (dataDevolucao == null) {
            return LocalDate.now().isAfter(dataPrevisaoDevolucao);
        }
        return dataDevolucao.isAfter(dataPrevisaoDevolucao);
    }

    public boolean estaConcluido() {
        return dataDevolucao != null;
    }
}
