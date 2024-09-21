package pacote;

enum Cargo{
    Gerente(1),
    SubGerente(2),
    Faxineiro(3)

    private int num;

    DiaDaSemana(int cargo) {
        this.num = cargo;
    }

    public int getNome() {
        return num;
    }
} 
public class Funcionario {
    private String Name;   
    private Cargo cargo;
    private double Salario;

    Funcionario(){
        this.Name = null;
        this.cargo = null;
        this.Salario = 0;
    }

    Funcionario(String nome, Cargo cargo, double salario){
        this.Name = nome;
        this.cargo = cargo;
        this.Salario = salario;
    }

    public void setSalario(double salarioNovo){
        this.Salario = salarioNovo;
    }

    public double getSalario(){
        return Salario;
    }

    public void setCargo(Cargo cargoNovo){
        this.cargo = cargoNovo;
    }

    public Cargo getCargo(){
        return cargo;
    }

    public String getName(){
        return Name;
    }
    public void setName(String nomeNovo){
        this.Name = nomeNovo;
    }
    public void removeFuncinario(Funcionario fun){

    }
}
