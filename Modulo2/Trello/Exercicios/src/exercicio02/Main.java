package exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        int a, b;

        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.printf("Informe o segundo valor: ");
        b = ler.nextInt();

        System.out.println("Soma: "+(a+b));
    }
}