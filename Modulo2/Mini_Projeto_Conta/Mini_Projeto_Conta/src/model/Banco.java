package model;
import exceptions.SaldoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaCorrente> ContaCorrentes = new ArrayList<ContaCorrente>();
    List<ContaPoupanca> ContaPoupancas = new ArrayList<ContaPoupanca>();

    public void adicionarContaCorrente(ContaCorrente conta) {
        ContaCorrentes.add(conta);
    }

    public void adicionarContaPoupanca(ContaPoupanca conta) {
        ContaPoupancas.add(conta);
    }

    public void detalharContas() {
        System.out.println("=============== Conta Corrente ===============");
        for (int i=0; i<ContaCorrentes.size(); i++) {
            ContaCorrentes.get(i).exibirDetalhes();
        }
        System.out.println("=======================================");

        System.out.println("=============== Conta Poupanca ===============");
        for (int i=0; i<ContaPoupancas.size(); i++) {
            ContaPoupancas.get(i).exibirDetalhes();
        }
        System.out.println("=======================================");

    }


}
