package model;

import exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (this.limite+getSaldo()<valor){
            throw new SaldoInsuficienteException("Saldo Conta Insuficiente.");
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
