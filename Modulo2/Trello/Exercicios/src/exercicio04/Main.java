package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int produto1,produto2;

        System.out.printf("Informe o valor do produto: ");
        produto1 = ler.nextInt();

        System.out.printf("Informe o valor do produto: ");
        produto2 = ler.nextInt();

        System.out.println("Produto = "+(produto1*produto1));
    }
}