package Arrays;
import java.util.Locale;
import java.util.Scanner;

import ArrayEntities.Produtos;
import ArrayEntities.classeExArray;

public class exArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        classeExArray[] vect = new classeExArray[10];
        System.out.print("Quantos quartos quer selecionar? ");
        int n = sc.nextInt();


        for (int i = 1; i<=n; i++) {

            System.out.println("Quarto #"+ i +": ");
            System.out.print("Informe o nome para alugar o quarto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Agora o e-mail do responsável: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numQ = sc.nextInt();
            vect[numQ] = new classeExArray(nome, email);
        }
        System.out.println("");
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i< 10; i++){
            if (vect[i] != null){
             System.out.println(i + " - "+ (vect[i]));
            }
        }


    sc.close();
    }
}
