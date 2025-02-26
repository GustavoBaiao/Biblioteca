package service;

import model.Emprestimo;
import model.Item;
import model.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicoEmprestimo {
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Emprestimo emprestarItem(Pessoa pessoa, Item item) {
        if(!pessoa.podeRealizarEmprestimo()){
            throw new LimiteEmprestimosExcedidoException("Limite de empréstimos atingido para: " + pessoa.getNome());
        }

        if (!item.isDisponivel()){
            throw new ItemIndisponivelException("O item '" + item.getTitulo() + "' não está disponível para empréstimo.");
        }

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataPrevistaEmprestimo = dataEmprestimo.plusDays(14);

        Emprestimo emprestimo = new Emprestimo(
                (long) (emprestimos.size()+1),
                item,
                pessoa,
                dataEmprestimo,
                dataPrevistaEmprestimo,
                null
        );

        item.setDisponivel(false);
        pessoa.getEmprestimosAtivos().add(emprestimo);
        emprestimos.add(emprestimo);

        return emprestimo;
    }

    public boolean devolverItem(Pessoa pessoa, Emprestimo emprestimo) {
        if (pessoa.getEmprestimosAtivos().contains(emprestimo)){
            emprestimo.setDataDevolucao(LocalDate.now());

            pessoa.getEmprestimosAtivos().remove(emprestimo);

            System.out.println("Item " + emprestimo.getItem().getTitulo() + " devolvido!");
            return true;
        }else{
            System.out.println("Erro: este empréstimo não pertence a essa pessoa ou ja foi devolvida.");
            return false;
        }
    }

}
