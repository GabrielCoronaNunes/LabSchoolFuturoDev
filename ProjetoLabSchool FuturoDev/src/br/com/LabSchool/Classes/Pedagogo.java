package br.com.LabSchool.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedagogo extends Pessoa{
    //ATRIBUTOS
    private int totalAtendimentosPedagogicos;
    private static List<Pedagogo> listaPedagogos = new ArrayList<Pedagogo>();

    //CONSTRUTOR
    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        this.totalAtendimentosPedagogicos = 0;
    }
    //GETTERS E SETTERS

    public int getTotalAtendimentosPedagogicos() {
        return totalAtendimentosPedagogicos;
    }

    public void setTotalAtendimentosPedagogicos(int totalAtendimentosPedagogicos) {
        this.totalAtendimentosPedagogicos = totalAtendimentosPedagogicos;
    }

    public static List<Pedagogo> getListaPedagogos() {
        return listaPedagogos;
    }

    public static void setListaPedagogos(List<Pedagogo> listaPedagogos) {
        Pedagogo.listaPedagogos = listaPedagogos;
    }

    //MÉTODOS

    public static void cadastrarPedagogo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome.");
        String nome = input.nextLine();
        System.out.println("Digite o telefone.");
        String telefone = input.nextLine();
        System.out.println("Digite a data de nascimento.");
        String dataNascimento = input.nextLine();
        System.out.println("Digite o CPF.");
        String cpf = input.nextLine();
        Pedagogo pedagogo = new Pedagogo(nome, telefone, dataNascimento, cpf);
        listaPedagogos.add(pedagogo);
        Pessoa.adicionarPessoa(pedagogo);
        Pessoa.adicionarFuncionario(pedagogo);
    }

    public static void listarPedagogos(){
        for (int i = 0; i < listaPedagogos.size(); i++) {
            System.out.println("(" + i + 1 + ")" + listaPedagogos.get(i).toString());
        }
    }

    public  void adicionarAtendimento(){
        this.totalAtendimentosPedagogicos += 1;

    }
    public static  void realizarAtendimento(){
        Scanner input = new Scanner(System.in);
        Aluno.listarTodos();
        System.out.println("Digite o aluno que receberá o atendimento.");
        int respostaAluno = input.nextInt();
        Aluno aluno = Aluno.getListaAlunos().get(respostaAluno);

        listarPedagogos();
        System.out.println("Digite o pedagogo que irá fazer o tratamento.");
        int respostaPedagogo = input.nextInt();
        Pedagogo pedagogo = getListaPedagogos().get(respostaPedagogo);
        aluno.adicionarAtendimento();
        pedagogo.adicionarAtendimento();
    }

}
