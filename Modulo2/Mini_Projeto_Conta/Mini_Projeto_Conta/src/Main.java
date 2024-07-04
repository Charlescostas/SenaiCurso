import exceptions.SaldoInsuficienteException;
import model.Banco;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        ContaCorrente conta1 = new ContaCorrente("Charles",0.00,300.00);
        ContaCorrente conta2 = new ContaCorrente("Tati",0.00,150.00);

        conta1.depositar(500.00);
        conta2.depositar(200.00);
        try {
            conta1.sacar(100.00);
            conta1.sacar(150.00);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

        banco.adicionarContaCorrente(conta1);
        banco.adicionarContaCorrente(conta2);

        ContaPoupanca Poupanca1 = new ContaPoupanca("Davi",0.00,600.00);
        ContaPoupanca Poupanca2 = new ContaPoupanca("Isabela",0.00,250.00);

        Poupanca1.depositar(300.00);
        Poupanca2.depositar(200.00);

        try {
            Poupanca1.sacar(100.00);
            Poupanca1.sacar(150.00);
            Poupanca2.sacar(350.00);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

        banco.adicionarContaPoupanca(Poupanca1);
        banco.adicionarContaPoupanca(Poupanca2);

        banco.detalharContas();

    }
}