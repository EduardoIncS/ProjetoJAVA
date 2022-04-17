package ProjetoJAVA;

public class MainPessoas {
    public static void main (String[] args){
        Fornecedor f1 = new Fornecedor("Lucas", "Rua do Mundo", "40028922", 1000, 200);
        f1.exibir();
        System.out.println("O saldo obtido do fornecedor é: "+ f1.obterSaldo());

        System.out.println("");

        Empregado f2 = new Empregado("Eduardo", "Rua de Marte", "08007777000", 122436, 1500);
        f2.exibir();
        System.out.println("O salário de "+f2.getNome()+" é de "+f2.getsalario());
    }
    
}