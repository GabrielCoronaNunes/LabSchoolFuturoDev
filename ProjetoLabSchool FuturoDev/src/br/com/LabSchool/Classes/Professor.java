package br.com.LabSchool.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends  Pessoa{

    //ATRIBUTOS
    private String formacao;
    private String areaDesenvolvimento;
    private String situacaoProfessor;

    private static List<Professor> listaProfessores = new ArrayList<Professor>();

    //CONSTRUTOR

    public Professor(String nome, String telefone, String dataNascimento, String cpf, String formacao, String areaDesenvolvimento, String situacaoProfessor ){
        super(nome, telefone, dataNascimento, cpf);
        this.formacao = formacao;
        this.areaDesenvolvimento = areaDesenvolvimento;
        this.situacaoProfessor = situacaoProfessor;
    }

    //GETTERS E SETTERS

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaDesenvolvimento() {
        return areaDesenvolvimento;
    }

    public void setAreaDesenvolvimento(String areaDesenvolvimento) {
        this.areaDesenvolvimento = areaDesenvolvimento;
    }

    public String getSituacaoProfessor() {
        return situacaoProfessor;
    }

    public void setSituacaoProfessor(String situacaoProfessor) {
        this.situacaoProfessor = situacaoProfessor;
    }

    public static List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public static void setListaProfessores(List<Professor> listaProfessores) {
        Professor.listaProfessores = listaProfessores;
    }

    //MÉTODOS

    public static void cadastrarProfessor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome.");
        String nome = input.nextLine();
        System.out.println("Digite o telefone.");
        String telefone = input.nextLine();
        System.out.println("Digite a data de nascimento.");
        String dataNascimento = input.nextLine();
        System.out.println("Digite o CPF.");
        String cpf = input.nextLine();
        System.out.println("Digite a formação acadêmica.");
        String formacao = input.nextLine();
        System.out.println("Digite a área de desenvolvimento.");
        String areaDesenvolvimento = input.nextLine();
        System.out.println("Digite a situação do professor.");
        String situacaoProfessor = input.nextLine();
        Professor professor = new Professor(nome, telefone, dataNascimento, cpf, formacao, areaDesenvolvimento, situacaoProfessor);
        listaProfessores.add(professor);
        Pessoa.adicionarPessoa(professor);
        Pessoa.adicionarFuncionario(professor);
    }

    public static void ListarTodos(){
        for (int i = 0; i < listaProfessores.size(); i++) {
            System.out.println("(" + i + 1 + ")" + listaProfessores.get(i).toString());
        }

    }
 
}
