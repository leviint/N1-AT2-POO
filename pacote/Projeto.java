package pacote;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    
    //atributos
    String nome;
    LocalDate dataAtual;
    LocalDate prazo = LocalDate.now().plusDays(5);
    Funcionario funcionarioResponsavel;
    List<Funcionario> funcionarios;

    //construtores
    public Projeto(String nome,LocalDate prazo, Funcionario funcionarioResponsavel){
        this.nome = nome;
        this.dataAtual = LocalDate.now();
        this.prazo = prazo;
        this.funcionarioResponsavel = new Funcionario();
        this.funcionarios = new ArrayList<>();
    }

    public Projeto(String nome, LocalDate prazo){
        this.nome = nome;
        this.prazo = prazo;
    }

    //métodos
    public void adicionarFuncionario(Funcionario funcionario){
        System.out.println("\nOpção Selecionada: [1] - Adicionar Funcionário\n");
        funcionarios.add(funcionario);
    }

    public void alterarFuncionario(Funcionario funcionario){
        
    }

    public void removerFuncionario(Funcionario funcionario){
        System.out.println("\nOpção Selecionada: [2] - Remover Funcionário\n");
        funcionarios.remove(funcionario);
    }

    public void checarPrazo(){
        dataAtual = LocalDate.now();

        if(dataAtual.isBefore(prazo)){
            System.out.println("O projeto ainda está dentro do prazo.");
        }else if (dataAtual.isEqual(prazo)){
            System.out.println("Hoje é o último dia do prazo.");
        }else{
            System.out.println("O prazo do projeto expirou.");
        }
    }

}

    