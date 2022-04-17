package People.ProjetoJAVA;

public class Empregado extends Pessoas {
    public int codSetor;
    public float salario;
    
    public Empregado(String Nome, String Endereco, String Telefone, int codSetor, float salario){
        super(Nome, Endereco, Telefone);
        this.codSetor = codSetor;
        this.salario = salario;
    }

    public int getcodSetor(){
        return codSetor;
    }
    public float getsalario(){
        return salario;
    }

    public void setcodSetor(int codSetor){
        this.codSetor = codSetor;
    }
    public void salario(float salario){
        this.salario = salario;
    }
    

    
}
