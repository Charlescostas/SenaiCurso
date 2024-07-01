package model;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String titular, double saldo, double rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }

    public void aplicarRendimento(double rendimento){
        this.setSaldo(getSaldo()+(getSaldo() * (rendimento/100)));
    };

    @Override
    public void sacar(Double valor) {
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("=============== EXTRATO ===============");
        System.out.println("== TITULAR: "+getTitular()+"===");
        System.out.println("==   SALDO: "+getTitular()+"===");
        System.out.println("=======================================");
    }
}
