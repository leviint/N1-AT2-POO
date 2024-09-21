package pacote;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Principal {
    Scanner sc = new Scanner(System.in);
    List<Projeto> projetos = new ArrayList<>();

    public static void main(String[] args) {
        Principal pr = new Principal();
        boolean entradaValida = false;
        boolean projetoRodando = true;

        while (projetoRodando || !entradaValida) {
            try {                
                System.out.printf("\t\t_____TaskFlow_____\n\t\tGerenciador de Projeto:\n[1] - Gerenciar Projeto\n[2] - Gerenciar Funcionários de um Projeto\n[3] - Sair\n");
                int choice = pr.sc.nextInt();
                pr.sc.nextLine(); 


                switch (choice) {
                    case 1 -> { 
                        pr.GerenciarProjeto();
                        entradaValida = true;
                    } 
                    case 2 -> {                                                                                                         
                        pr.GerenciarFuncionariosProjeto();
                        entradaValida=true;
                    }           
                    case 3 -> {             
                        projetoRodando = false;
                        entradaValida = true;                                                       
                        break;
                    }           

                }            
            } catch (Exception e) {
                System.out.println("Entrada do input está inválida.");
            }
        }
    }    

    public void menuPrincipal() {
        Principal pr = new Principal();
        boolean entradaValida = false;
        boolean projetoRodando = true;

        while (true || !entradaValida) {
            try {                
                System.out.printf("\t\t_____TaskFlow_____\n\t\tGerenciador de Projeto:\n[1] - Gerenciar Projeto\n[2] - Gerenciar Funcionários de um Projeto\n[3] - Sair\n");
                int choice = pr.sc.nextInt();
                pr.sc.nextLine(); 


                switch (choice) {
                    case 1 -> { 
                        pr.GerenciarProjeto();
                        entradaValida = true;
                    } 
                    case 2 -> {             
                                                                                               
                        pr.GerenciarFuncionariosProjeto();
                        entradaValida=true;
                    }           
                    case 3 -> {             
                        System.exit(0);                        
                    }           

                }            
            } catch (Exception e) {
                System.out.println("Entrada do input está inválida.");
            }
        }
    }

    public void GerenciarProjeto() {
        System.out.printf("\t\t_____TaskFlow_____\nProjeto:\n[1] - Criar Projeto\n[2] - Remover Projeto\n[3] - Verificar Prazo\n");
        int choice = sc.nextInt();
        boolean entradaValida = false;

        sc.nextLine(); 
        while(!entradaValida) {
            try {                
                switch (choice) {
                    case 1 -> {
                        System.out.println("Digite o nome do projeto:");
                        String nomeProjeto = sc.nextLine();
                        System.out.println("Digite o prazo de entrega do projeto (formato dd/MM/yyyy):");
                        String prazoEntrega = sc.nextLine();

                        Projeto projeto = new Projeto(nomeProjeto, prazoEntrega);

                        boolean prazoValido = projeto.prazoEntregaValido(prazoEntrega);

                        if(prazoValido) {
                            projetos.add(projeto);
                            System.out.println("Projeto " + nomeProjeto + " criado com sucesso.");
                        } else {
                            System.out.println("Projeto " + nomeProjeto + " não pode ser criado.");
                        }
                        entradaValida = true;
                    }
                    case 2 -> {
                        listarProjetos();
                        System.out.println("Digite o número do projeto a ser removido:");
                        int index = sc.nextInt() - 1;
                        if (index >= 0 && index < projetos.size()) {
                            Projeto removido = projetos.remove(index);
                            System.out.println("Projeto " + removido.getNome() + " removido.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                        entradaValida = true;
                    }
                    case 3 -> {
                        listarProjetos();
                        System.out.println("Digite o número do projeto para verificar o prazo:");
                        int index = sc.nextInt() - 1;
                            

                        if (index >= 0 && index < projetos.size()) {
                            Projeto projeto = projetos.get(index);
                            projeto.exibirPrazo();
                            if (projeto.estaDentroDoPrazo()) {
                                System.out.println("O projeto está dentro do prazo.");
                            } else {
                                System.out.println("O prazo do projeto já foi ultrapassado.");
                            }
                        } else {
                            System.out.println("Índice inválido.");
                        }
                        entradaValida = true;
                    }                    
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
            }
        }
    }

    public void GerenciarFuncionariosProjeto() {
        if(this.projetos.isEmpty()) {
            System.out.println("Você primeiro precisa criar um projeto!");
            return;
        }


        listarProjetos();
        System.out.println("Escolha o projeto para gerenciar os funcionários:");
        int indexProjeto = sc.nextInt() - 1;
        sc.nextLine(); 

        boolean indexProjetoentradaValida = false;



        while(!indexProjetoentradaValida) {
            try {                                 
                Projeto projeto = projetos.get(indexProjeto);

                while (true) {
                    System.out.printf("\t\t_____TaskFlow_____\nFuncionários do Projeto %s:\n[1] - Adicionar Funcionário\n[2] - Remover Funcionário\n[3] - Editar Funcionário\n[4] - Listar Funcionários\n[5] - Voltar\n", projeto.getNome());
                   int choice = sc.nextInt();
                    sc.nextLine(); 

                    boolean entradaValidaOpcaoFuncionario = false;
                    

                    while(!entradaValidaOpcaoFuncionario) {
                        try {
                            switch (choice) {
                                case 1 -> {
                                    Funcionario fun = new Funcionario();
                                    System.out.println("Digite o nome do funcionário:");
                                    fun.setName(sc.nextLine());
                                    System.out.println("Digite o cargo do funcionário:");
                                    fun.setCargo(sc.nextLine());
                                    System.out.println("Digite o salário do funcionário:");
                                    fun.setSalario(sc.nextDouble());
                                    projeto.adicionarFuncionario(fun);
                                    entradaValidaOpcaoFuncionario = true;
                                }
                                case 2 -> {
                                    System.out.println("Digite o nome do funcionário a ser removido:");
                                    String nomeFuncionario = sc.nextLine();
                                    projeto.removerFuncionarioPorNome(nomeFuncionario);
                                    entradaValidaOpcaoFuncionario = true;
                                }
                                case 3 -> {
                                    System.out.println("Digite o nome do funcionário a ser editado:");
                                    String nomeFuncionario = sc.nextLine();
                                    projeto.editarFuncionarioPorNome(nomeFuncionario);
                                    entradaValidaOpcaoFuncionario = true;
                                }
                                case 4 -> {
                                    projeto.listarFuncionarios();
                                    entradaValidaOpcaoFuncionario = true;
                                } 
                                case 5 -> {
                                    menuPrincipal();
                                    break;
                                }                           
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um número válido!");
                        }
                    }
                }                
            } catch (InputMismatchException e) {
                System.out.println("Índice inválido.");                
            }        
        }
    }

    
    public void listarProjetos() {
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
        } else {
            System.out.println("Projetos disponíveis:");
            for (int i = 0; i < projetos.size(); i++) {
                Projeto projeto = projetos.get(i);
                System.out.println((i + 1) + ". " + projeto.getNome());
            }
        }
    }
}
