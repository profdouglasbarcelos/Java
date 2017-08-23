package views;

import banco.BancoDadosInstituicao;
import controllers.AlunosController;
import java.util.Scanner;
import models.Aluno;

public class AlunoView {

    Scanner scan = new Scanner(System.in);

    public void exibirMenuAluno() {
        System.out.println("Digite:");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Exibir dados Aluno");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                adicionarAluno();
                break;
            case 2:
                listarAlunos();
                break;
            case 3:
                exibirPorCodigo();
        }
    }

    private void adicionarAluno() {
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite o cpf do aluno: ");
        String cpf = scan.nextLine();

        AlunosController.adicionarAluno(cod, nome, cpf);
    }

    private void listarAlunos() {

        System.out.println("---");

        for (Aluno a : BancoDadosInstituicao.getTabelaAluno()) {

            System.out.println("Codigo: " + a.getCodigo());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Cpf: " + a.getCpf());
            System.out.println("");
        }
        System.out.println("---");
    }

    private void exibirPorCodigo() {
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Aluno z = AlunosController.buscarPorCodigo(cod);

        if (z != null) {
            System.out.println("Codigo: " + z.getCodigo());
            System.out.println("Nome: " + z.getNome());
            System.out.println("Cpf: " + z.getCpf());
            System.out.println("");
        } else {
            System.out.println("Aluno não encontrado");
        }

    }
}
