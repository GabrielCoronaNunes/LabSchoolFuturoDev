package br.com.LabSchool.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    //ATRIBUTOS
    private String statusMatricula;
    private Double notaEntrada;
    private int totalAtendimentosPedagogicos;
    private static List<Aluno> listaAlunos = new ArrayList<Aluno>();

    //CONSTRUTOR
    public Aluno(String nome, String telefone, String dataNascimento, String cpf, String statusMatricula, Double notaEntrada) {
        super(nome, telefone, dataNascimento, cpf);
        this.statusMatricula = statusMatricula;
        this.notaEntrada = notaEntrada;
        this.totalAtendimentosPedagogicos = 0;
    }

    //GETTERS E SETTERS

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public Double getNotaEntrada() {
        return notaEntrada;
    }

    public void setNotaEntrada(Double notaEntrada) {
        this.notaEntrada = notaEntrada;
    }

    public int getTotalAtendimentosPedagogicos() {
        return totalAtendimentosPedagogicos;
    }

    public void setTotalAtendimentosPedagogicos(int totalAtendimentosPedagogicos) {
        this.totalAtendimentosPedagogicos = totalAtendimentosPedagogicos;
    }

    public static List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static void setListaAlunos(List<Aluno> listaAlunos) {
        Aluno.listaAlunos = listaAlunos;
    }

    //MÉTODOS

    public static void cadastrarAluno() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome.");
        String nome = input.nextLine();
        System.out.println("Digite o telefone.");
        String telefone = input.nextLine();
        System.out.println("Digite a data de nascimento.");
        String dataNascimento = input.nextLine();
        System.out.println("Digite o CPF.");
        String cpf = input.nextLine();
        System.out.println("Digite a nota de entrada.");
        Double notaEntrada = input.nextDouble();
        if (notaEntrada < 0 || notaEntrada > 10
        ) {
            System.out.println("Nota não aceita.");
        }
        System.out.println("Digite a situação do aluno: ");
        String statusMatricula = input.nextLine();

        Aluno aluno = new Aluno(nome, telefone, dataNascimento, cpf, statusMatricula, notaEntrada);
        listaAlunos.add(aluno);
        Pessoa.adicionarPessoa(aluno);
    }

    public static void listarTodos() {
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("(" + i + 1 + ")" + listaAlunos.get(i).toString());
        }
    }

    public static void listarPorStatus() {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunoSelecionado = new ArrayList<Aluno>();
        System.out.println("Qual status deseja conferir?");
        String statusMatricula = input.nextLine();
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (statusMatricula.equalsIgnoreCase(listaAlunos.get(i).getStatusMatricula())) {
                alunoSelecionado.add(listaAlunos.get(i));
            }
        }

        for (int i = 0; i < alunoSelecionado.size(); i++) {
            System.out.println(alunoSelecionado.get(i).toString());
        }

    }

    public static void mudarStatusMatricula() {
        Scanner input = new Scanner(System.in);
        String statusMatricula;
        listarTodos();
        System.out.println("Deseja mudar o status de qual aluno?");
        int n =input.nextInt();
        System.out.println("Qual o novo status de matrícula do aluno?");
        statusMatricula = input.nextLine();
        listaAlunos.get(n).setStatusMatricula(statusMatricula);

    }
    public void adicionarAtendimento() {
        this.totalAtendimentosPedagogicos += 1;
        this.setStatusMatricula("Em Atendimento Pedagógico");
    }
}
