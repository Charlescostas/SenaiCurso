package exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double produto1,produto2,media;

        System.out.printf("Informe a nota do aluno: ");
        produto1 = ler.nextDouble();

        System.out.printf("Informe a nota do aluno: ");
        produto2 = ler.nextDouble();

        media = (((produto1*3.5)+(produto2*7.5))/11);

        System.out.println("Media = "+String.format("%.2f", media));
    }
}