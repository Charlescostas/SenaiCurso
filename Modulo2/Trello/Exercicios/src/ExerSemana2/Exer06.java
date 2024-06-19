package ExerSemana2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> listas = new ArrayList<String>();
        ArrayList<String> listasNova = new ArrayList<String>();

        listas.add("Arroz");
        listas.add("Feijão");
        listas.add("Macarrão");
        listas.add("Grão-de-bico");
        listas.add("Lentilha");
        listas.add("Açúcar");
        listas.add("Sal");
        listas.add("Óleo");
        listas.add("Azeite");
        listas.add("Temperos prontos");
        listas.add("Maionese");
        listas.add("Extrato e molho de tomate");
        listas.add("Fermento");
        listas.add("Massa para bolo");
        listas.add("Trigo");
        listas.add("Enlatados (ervilha e milho)");
        listas.add("Farinhas");
        listas.add("Farofas");
        listas.add("Café");
        listas.add("Chá");
        listas.add("Leite");

        System.out.println("Informe caracter para pesquisar.") ;
        char aux1 = ler.next().toUpperCase().charAt(0);

        for (int i=0; i<listas.size(); i++) {
            char aux = listas.get(i).toUpperCase().charAt(0);
            if (aux==aux1){
                listasNova.add(listas.get(i));
            }
        }

        System.out.println("Lista: " + listas);
        System.out.println("ListaNova: " + listasNova);

        ler.close();
    }
}