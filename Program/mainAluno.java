package Program;
import java.util.Scanner;
import java.util.Locale;
import Entities.Aluno;

public class mainAluno {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextInt();
        aluno.nota2 = sc.nextInt();
        aluno.nota3 = sc.nextInt();

        System.out.println("Nota final: " + aluno.notaFinal());

        if (aluno.notaFinal() < 60){
            System.out.println("FAILED.");
            System.out.println("Pontos faltantes: "+ aluno.resultFinal());
        } else {
            System.out.println("PASS.");
        }
            sc.close();
    }
}
