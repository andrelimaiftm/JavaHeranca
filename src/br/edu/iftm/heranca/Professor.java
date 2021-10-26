package br.edu.iftm.heranca;

public class Professor extends Pessoa{

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, char sexo,
        String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(){
        this.salario += this.salario*0.1;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + ", especialidade=" + especialidade + ", salario=" + salario + "]";
    }

    
    
}
