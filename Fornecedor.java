package ProjetoJAVA;

public class Fornecedor extends Pessoas {
    private float valorCredito;
    private float valorDivida;

    public Fornecedor(String Nome, String Endereco, String Telefone, float valorCredito, float valorDivida){
        super(Nome, Endereco, Telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public float getvalorCredito(){
        return valorCredito;
    }
    public float getvalorDivida(){
        return valorDivida;
    }

    public void setvalorCredito(float valorCredito){
        this.valorCredito = valorCredito;
    }
    public void setvalorDivida(float valorDivida){
        this.valorDivida = valorDivida;
    }
    
    public float obterSaldo(){
        return valorCredito - valorDivida;
    }
}