package service;

import model.Aluno;
import model.Pessoa;
import model.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoCadastroPessoa {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores  = new ArrayList<>();

    private static Long contador = 1L;

    public static synchronized Long gerarID() {
        return contador++;
    }

    public void cadastrarAluno() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite o email do aluno: ");
        String email = sc.nextLine();

        System.out.print("Digite o telefone do aluno: ");
        String telefone = sc.nextLine();

        System.out.print("Digite o limite de empréstimos: ");
        int limiteEmprestimos = sc.nextInt();

        System.out.print("Digite a matrícula do aluno: ");
        int matricula = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha para evitar erro

        System.out.print("Digite o curso do aluno: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(gerarID(), nome, email, telefone, limiteEmprestimos, new ArrayList<>(), matricula, curso);

        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() +  " cadastrado com sucesso!");
        sc.close();
    }

    public void cadastrarProfessor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.print("Digite o email do professor: ");
        String email = sc.nextLine();
        System.out.print("Digite o telefone do professor: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o limite de emprestimos: ");
        int limiteEmprestimos = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o departameto do professor: ");
        String departamento = sc.nextLine();

        Professor professor = new Professor(gerarID(), nome, email, telefone, limiteEmprestimos, new ArrayList<>(),departamento);

        professores .add(professor);
        System.out.println("Professor " + professor.getNome() + " cadastrado com sucesso!");
        sc.close();
    }
}
