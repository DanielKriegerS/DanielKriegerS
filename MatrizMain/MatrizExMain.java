package MatrizMain;
import java.util.Locale;
import java.util.Scanner;
import MatrizEntities.EntitiesMatriz;

public class MatrizExMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number os lines and columns in array: ");
        System.out.print("");
        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println("");
        System.out.println("Negative numbers: ");
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count++;
            for (int j = 0; j < N; j++)
                if (mat[i][j] < 0)
            System.out.print(mat[i][j]);

        }

        System.out.println("");
        System.out.print("Total of negative: "+ count);
            sc.close();
        }
    }
