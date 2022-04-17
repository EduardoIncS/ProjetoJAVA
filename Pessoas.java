package People;

public class Pessoas {
    private String Nome;
    private String Endereco;
    private String Telefone;
    
    Pessoas (String Nome, String Endereco, String Telefone){
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public String getNome(){
        return Nome;
    }
    public String getEndereco(){
        return Endereco;
    }
    public String getTelefone(){
        return Telefone;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }

    public void exibir(){
        System.out.println("Nome: "+ Nome);
        System.out.println("Endereço: "+ Endereco);
        System.out.println("Telefone: "+ Telefone);
    }

}

