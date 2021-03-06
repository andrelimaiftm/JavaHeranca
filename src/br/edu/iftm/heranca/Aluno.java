package br.edu.iftm.heranca;

public class Aluno extends Pessoa {
  
    private String matricula;
    private String curso;
    
    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }   

    public void cancelarMatricula() {
        this.matricula = null;
        this.curso = null;
    }

    public void alteraCadastro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + ", curso=" + curso + ", matricula=" + matricula + "]";
    }

    

    

}
