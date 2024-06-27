package model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
        this.sacar(saldo);
    }

    @Override
    public void sacar(Double valor) {
        if (this.limite+getSaldo()<valor){
            System.out.println("Valor do saque maior que o limite.");
        }
        else {this.sacar(getSaldo()-valor);}
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=============== EXTRATO ===============");
        System.out.println("== TITULAR: "+getTitular()+"===");
        System.out.println("==   SALDO: "+getTitular()+"===");
        System.out.println("=======================================");
    }
}
