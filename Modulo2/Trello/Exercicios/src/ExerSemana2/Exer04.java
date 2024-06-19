package ExerSemana2;

import java.util.Scanner;
import java.util.ArrayList;

public class Exer04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> compras = new ArrayList<String>();
        char aux = 'S';

        do{
            System.out.println("Informe um produto que vai add a lista de compra: ") ;
            compras.add(ler.next().toUpperCase());

            System.out.println("Informe (S) para add novo Compra ou (N) para sair.") ;
            aux = ler.next().toUpperCase().charAt(0);
        } while (aux == 'S');

        if (compras.size()!=0) {
            System.out.println("Deseja deletar algum produto? Sim (S) Não (N): ");
            aux = ler.next().toUpperCase().charAt(0);

            System.out.println("Informe compra que deseja deletar.") ;
            String aux1 = ler.next().toUpperCase();

            compras.remove(aux1);
        }

        System.out.println(compras);

        ler.close();
    }
}