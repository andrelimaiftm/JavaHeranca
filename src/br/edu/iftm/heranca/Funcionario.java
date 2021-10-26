package br.edu.iftm.heranca;

public class Funcionario extends Pessoa {

    private String setor;
    private String trabalhando;
    
    public Funcionario(String nome, int idade,
     char sexo, String setor, String trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    

    public void mudarTrabalho(String novaFuncao){
        this.trabalhando = novaFuncao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + ", setor=" + setor + ", trabalhando=" + trabalhando + "]";
    }

    
    
}
