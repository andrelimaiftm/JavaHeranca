package br.edu.iftm.heranca;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;    

    public Pessoa(String nome, int idade, 
        char sexo){
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
    }

    public void fazerAniversario(){
        String msg = String.
        format("Feliz Aniversario %s", this.nome);
        System.out.println(msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }    
    
}
