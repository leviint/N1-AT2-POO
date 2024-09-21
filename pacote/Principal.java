package pacote;

import java.util.Scanner;

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
        Funcionario funcionario = new Funcionario();
        while(true){
            System.out.printf("\t\t_____TaskFlow_____\nFuncionario:\n[1] - Criar\n[2] - alterar\n[3] - deletar\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> { //Criar
                    
                    System.out.printf("digite nome do funcionario:\n");
                    funcionario.setName(sc.nextLine());

                    System.out.printf("digite o cargo [Gerente,SubGerente,Faxineiro]:\n");
                    String testCargo = sc.nextLine();

                }
                case 2 -> { //Alterar
                    funcionario.alterarFuncionario();
                }
                case 3 -> { //Deletar
                    funcionario.removerFuncionario();
                }
                default -> System.out.printf("\nDigite um numero valido!");
            }
        }
    }

    public void GerenciarProjeto(){
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
            }
            case 2 -> {
            }
            default -> System.out.printf("\nDigite um número válido!");
        }
    }
    
}
