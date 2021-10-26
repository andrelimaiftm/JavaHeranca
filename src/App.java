import br.edu.iftm.heranca.Aluno;
import br.edu.iftm.heranca.Funcionario;
import br.edu.iftm.heranca.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a = new Aluno("Mathias", 45 , 'M', "123456", "ADS");
        Funcionario f = new Funcionario("Pedro", 20, 'M', "Secretaria", "Assitente de assuntos pedagogicos");
        Professor p = new Professor("Julia", 28, 'F', "Banco de Dados",4000d);
        a.fazerAniversario();
        a.cancelarMatricula();
        f.fazerAniversario();
        f.mudarTrabalho("Auxiliar geral");
        p.fazerAniversario();
        p.receberAumento();
        System.out.println(a);
        System.out.println(f);
        System.out.println(p);
    }
}
