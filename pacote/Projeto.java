package pacote;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    
    //atributos
    String nome;
    LocalDate dataAtual = LocalDate.now();
    LocalDate prazo;
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

}

    