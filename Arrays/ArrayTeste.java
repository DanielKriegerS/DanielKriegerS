package Arrays;

import java.util.Locale;
import java.util.Scanner;
import ArrayEntities.Produtos;

public class ArrayTeste {
    public static void main (String [] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            Produtos[] vect = new Produtos[n];

            for (int i=0; i<vect.length; i++){

                sc.nextLine();
                String nom = sc.nextLine();
                double v = sc.nextDouble();
                vect[i] = new Produtos(nom, v);

        }

        double media = 0.0;
            for (int i = 0; i<vect.length; i++){
                media+= vect[i].getValor();
        }
            double mediaF = media/vect.length;
            System.out.printf("Média de preços: $%.2f%n", mediaF);
        sc.close();
    }
}
