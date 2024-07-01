package model;

public abstract class Conta {
    private final String titular;
    private double saldo;

    protected Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = getSaldo() + valor;
    };

    public abstract void sacar(Double valor);

    public abstract void exibirDetalhes();

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
