package ExerSemana2;

public class Exer03 {
    public static void main(String[] args) {
        int numeros[][] = new int[3][3];
        int i, j;
        int iMaior = 0;

        numeros[0][0] = 1;
        numeros[0][1] = 5;
        numeros[0][2] = 30;

        numeros[1][0] = 50;
        numeros[1][1] = 2;
        numeros[1][2] = 36;

        numeros[2][0] = 150;
        numeros[2][1] = 25;
        numeros[2][2] = 53;

        for(i=0, j=2; i<3 && j >= 0; i++, j-- ) {
            if (numeros[i][j] > iMaior){
                iMaior = numeros[i][j];
            }
        }

        System.out.println("Maior Numero da Matrix:"+iMaior);
    }
}