package br.com.LabSchool.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String telefone;
    private String dataNascimento;
    private String cpf;
    private int id;
    private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    private static List<Pessoa> listaFuncionarios = new ArrayList<Pessoa>();
    private static final AtomicInteger count = new AtomicInteger(0);

    //CONSTRUTOR

    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        id = count.incrementAndGet();
    }

    //GETTERS E SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public static void setListaPessoas(List<Pessoa> listaPessoas) {
        Pessoa.listaPessoas = listaPessoas;
    }

    public static List<Pessoa> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static void setListaFuncionarios(List<Pessoa> listaFuncionarios) {
        Pessoa.listaFuncionarios = listaFuncionarios;
    }

    //MÉTODOS

    public static String cpf() {
        Scanner input = new Scanner(System.in);
        String cpf;
        System.out.println("Digite o CPF");
        cpf = input.nextLine();
        return cpf;
    }

    public static void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static void listarTodos() {
        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.println("(" + i + 1 + ")" + listaPessoas.get(i).toString());
        }
    }
    public static void adicionarFuncionario(Pessoa pessoa) {
        listaFuncionarios.add(pessoa);
    }
    public static void listarFuncionarios(){
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            System.out.println("(" + i + 1 + ")" + listaFuncionarios.get(i).toString());
        }
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ", Data de Nascimento: " + this.getDataNascimento() + ", CPF: " + this.getCpf()
                + ", ID: " + this.getId();
    }

}
