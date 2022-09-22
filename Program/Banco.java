package Program;
import java.util.Scanner;
import java.util.Locale;
import Entities.ContaBanco;

public class Banco {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ContaBanco conta1;

        System.out.print("Entre o numero da conta: ");
        int numC = sc.nextInt();
        System.out.print("Entre o nome titular da conta: ");
        sc.nextLine();
        String nomeC = sc.nextLine();
        System.out.print("Deposito inicial? S/N " );
        char resposta = sc.next().charAt(0);
        if (resposta == 'S'){
            System.out.print("Informe o valor do deposito inicial: ");
            double depIni = sc.nextDouble();
            conta1 = new ContaBanco(numC, nomeC, depIni);
        } else {
            conta1 = new ContaBanco(numC, nomeC);
        }
        System.out.println("");
        System.out.println("Dados da conta: ");
        System.out.print(conta1);

        System.out.println("");
        System.out.print("Informe um valor para deposito: ");
        double valorDep = sc.nextDouble();
        conta1.deposito(valorDep);
        System.out.println("");
        System.out.println("Dados da conta: ");
        System.out.print(conta1);

        System.out.println("");
        System.out.print("Informe um valor para saque: ");
        double valorSaq = sc.nextDouble();
        conta1.saque(valorSaq);

        System.out.println("");
        System.out.println("Dados da conta: ");
        System.out.print(conta1);

        sc.close();
    }
}
