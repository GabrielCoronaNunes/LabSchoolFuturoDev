package br.com.LabSchool;

import br.com.LabSchool.Classes.Aluno;
import br.com.LabSchool.Classes.Pedagogo;
import br.com.LabSchool.Classes.Pessoa;
import br.com.LabSchool.Classes.Professor;

import java.util.Scanner;

public class Menu {
    public static void menuPrincipal() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        while (controle == true) {
            System.out.println("Bem vindo. Digite a opção que deseja.");
            System.out.println("1. Cadastro.");
            System.out.println("2. Listar");
            System.out.println("3. Realizar atendimento pedagógico.");
            System.out.println("4: Alterar status de matrícula de aluno.");
            System.out.println("0. Fechar");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    menuCadastro();
                    break;
                case 2:
                    menuListas();
                    break;
                case 3:
                    Pedagogo.realizarAtendimento();
                    break;
                case 4:
                    Aluno.mudarStatusMatricula();
                case 0:
                    controle = false;
            }

        }
    }

    public static void menuCadastro() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        while (controle = true) {
            System.out.println("Digite a opção que deseja cadastrar.");
            System.out.println("1: Aluno.");
            System.out.println("2. Professor.");
            System.out.println("3. Pedagogo.");
            System.out.println("0: Voltar");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    Aluno.cadastrarAluno();
                    break;
                case 2:
                       Professor.cadastrarProfessor();
                    break;
                case 3:
                    Pedagogo.cadastrarPedagogo();
                    break;
                case 0:
                    Menu.menuPrincipal();
                    break;
            }
        }
    }

    public static void menuListas() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        System.out.println("Digite qual lista deseja.");
        System.out.println("1:Listar alunos.");
        System.out.println("2:Listar professores.");
        System.out.println("3:Listar pedagogos.");
        System.out.println("4:Listar funcionários.");
        System.out.println("5:Listar todos.");
        System.out.println("0: Voltar");
        opcaoMenu = input.nextInt();

        switch (opcaoMenu) {
            case 1:
                menuListasAlunos();
                break;
            case 2:
                menuListasProfessores();
                break;
            case 3:
                menuListasPedagogos();
            case 4:
                Pessoa.listarFuncionarios();
                break;
            case 5:
                Pessoa.listarTodos();
                break;
            case 0:
                Menu.menuPrincipal();
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
    }

    public static void menuListasAlunos() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        while (controle) {
            System.out.println("Digite qual opção de lista de aluno deseja.");
            System.out.println("1: Listar todos os Alunos.");
            System.out.println("2: Listar Alunos por status de matrícula.");
            System.out.println("3: Listar Alunos por número de atendimentos.");
            System.out.println("0: Voltar");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    Aluno.listarTodos();
                    break;
                case 2:
                  //  Aluno.listarPorStatus();
                    break;
                case 3:
                    //Aluno.listarPorNumeroAtendimento();
                    break;
                case 0:
                    Menu.menuListas();
                    break;
            }
        }
    }

    public static void menuListasProfessores() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        while (controle = true) {


            System.out.println("Digite qual opção de lista para professor deseja:");
            System.out.println("1: Listar todos os professores.");
            System.out.println("2: Listar professor por área de desenvolvimento.");
            System.out.println("0: Voltar");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    Professor.ListarTodos();
                    break;
                case 2:
                    // Professor.listarPorAreaDesenvolvimento();
                    break;
                case 0:
                    Menu.menuListas();
                    break;
            }
        }
    }

    public static void menuListasPedagogos() {
        Scanner input = new Scanner(System.in);
        boolean controle = true;
        int opcaoMenu;

        while (controle = true) {
            System.out.println("Digite qual lista de pedagogos deseja.");
            System.out.println("1: Listar todos os pedagogos.");
            System.out.println("2: Listar pedagogos por número de atendimentos.");
            System.out.println("0: Voltar.");
            opcaoMenu = input.nextInt();
            switch (opcaoMenu) {
                case 1:
                         Pedagogo.listarPedagogos();
                    break;
                case 2:
                      //   Pedagogo.listarTodos();
                    break;
                case 0:
                    Menu.menuListas();
                    break;
            }
        }

    }
}
