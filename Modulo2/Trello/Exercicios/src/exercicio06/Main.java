package exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double total,valorHora;
        int qdtHoras;
        String funcionario;

        System.out.printf("Informe o nome do funcionário: ");
        funcionario = ler.nextLine();

        System.out.printf("Informe a quantidade de horas trabalhada: ");
        qdtHoras = ler.nextInt();

        System.out.printf("Informe o valor da hora trabalhada: ");
        valorHora = ler.nextDouble();

        total = (qdtHoras*valorHora);

        System.out.println("O funcionário " + funcionario +
                " trabalhou " + qdtHoras + " horas, e portanto possui R$ " +
                String.format("%.2f", total) + " a receber.");
    }
}