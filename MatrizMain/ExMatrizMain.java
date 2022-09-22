package MatrizMain;
import java.util.Locale;
import java.util.Scanner;
import MatrizEntities.EntitiesMatriz;

public class ExMatrizMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Number os lines and columns in array: ");
        System.out.print("");
        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; i++) {
                mat[l][c] = sc.nextInt();
            }
        }
        System.out.print("Number to verify: ");
        System.out.print("");
        int nV = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; i++) {
                if (mat[l][c] == nV){

                }
            }

        }
    }
}