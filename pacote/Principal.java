package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Projeto:
      adicionar funcinário
      remover funcionário
      checarPrazo: diz se o projeto está dentro do prazo ou não, baseado na data atual e nada data e entrega

    Funcionario:
      setters
      getters
      

*/

public class Principal {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Principal pr = new Principal();

        while(true){
            System.out.printf("\t\t_____TaskFlow_____\n\t\tGerenciador de Projeto:\n[1] - Funcionario\n[2] - Projeto\n");
            int choice = pr.sc.nextInt();
            switch (choice) {
                case 1:
                    pr.GerenciarFuncionario();
                    break;
                case 2:
                    pr.GerenciarProjeto();
                    break;
                default:
                    System.out.printf("\nDigite um numero valido!");
                    break;
                }
        }

    }
    
    public void GerenciarFuncionario(){
        List<Funcionario> funcionarios = new ArrayList<>();
        while(true){
            System.out.printf("\t\t_____TaskFlow_____\nFuncionario:\n[1] - Criar\n[2] - alterar\n[3] - deletar\n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { //Criar
                    Funcionario fun = new Funcionario();
                    System.out.printf("digite nome do funcionario:\n");
                    fun.setName(sc.nextLine());

                    while(true){
                        System.out.printf("digite o cargo [Gerente = 1,SubGerente = 2,Faxineiro = 3]:\n");
                        String testCargo = sc.nextLine();

                        if(testCargo.equals("Gerente") || testCargo.equals("SubGerente") || testCargo.equals("Faxineiro")){
                            fun.setCargo(testCargo);
                            break;
                        }
                        System.out.printf("Digitou errado \n");
                    }

                    System.out.printf("digite o salario do funcionario:\n");
                    fun.setSalario(sc.nextDouble());

                    funcionarios.add(fun);
                    break;
                }
                case 2 -> { // alterar
                    // mostrar os funcionarios
                    System.out.printf("escolhar qual funcionario");
                    int choiceChange = sc.nextInt();

                    Funcionario fun = funcionarios.get(choiceChange);

                    System.out.printf("\t\t_____TaskFlow_____\nFuncionario:\n[1] - Trocar nome\n[2] - trocar cargo\n[3] - trocar salario\n");
                    choiceChange = sc.nextInt();

                    switch (choiceChange) {
                        case 1 ->{
                            System.out.printf("digite o novo nome do funcionario");
                            String novoNome = sc.nextLine();
                            fun.setName(novoNome);
                        }
                        case 2 ->{
                            System.out.printf("digite o novo cargo do funcionario");
                            String novoCargo = sc.nextLine();
                            fun.setCargo(novoCargo);
                        }
                        case 3 ->{
                            System.out.printf("digite o novo salario do funcionario");
                            double novoSalario = sc.nextDouble();
                            fun.setSalario(novoSalario);
                        }
                        default -> System.out.printf("Digite entre o escodas opcoes [1, 2, 3]");
                    }
                }
                case 3 -> { //Deletar
                }

                default -> System.out.printf("\nDigite um numero valido!");
            }
        }
    }

    public void GerenciarProjeto(){
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> { //Criar Projeto
            }
            case 2 -> { //Remover Projeto
            }
            default -> System.out.printf("\nDigite um número válido!");
        }
    }
    
}
