package ExerSemana2;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        int numeros[] = new int[4];
        int media = 0;

        Scanner ler = new Scanner(System.in);

        for (int i=0; i<4; i++) {
            System.out.printf("Informe um numero inteiro: ");
            numeros[i] = ler.nextInt();
        }
        ler.close();

        media = calculaMedia(numeros);
        System.out.println("Media= "+media);
    }

    public static int calculaMedia(int numeros[]) {
        int soma = 0;
        int media = 0;

        for (int i=0; i<numeros.length; i++) {
            soma+= numeros[i];
        }

        media = (soma/numeros.length);
        return media;
    }
}