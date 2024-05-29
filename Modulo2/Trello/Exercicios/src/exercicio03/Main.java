package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, pi;

        pi = 3.14159;

        System.out.printf("Informe o raio: ");
        raio = ler.nextDouble();

        System.out.println("Area: "+(pi*(raio*raio)));
    }
}
