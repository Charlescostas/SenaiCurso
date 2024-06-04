package ExerSemana2;

public class Exer01 {
    public static void main(String[] args) {
        int numeros[] = new int[8];
        int soma = 0;
        int i;

        numeros[0] = 50;
        numeros[1] = 25;
        numeros[2] = 3;
        numeros[3] = 5;
        numeros[4] = 14;
        numeros[5] = 10;
        numeros[6] = 5;
        numeros[7] = 15;

        for (i=0; i<8; i++) {
            soma+= numeros[i];
        }

        System.out.println("Soma do Vetor = "+soma);
    }
}