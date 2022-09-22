package Program;
import java.util.Scanner;
import java.util.Locale;
import Utils.CurrencyConverter;

public class MainDolar {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do dolar: $");
        double valorD = sc.nextDouble();
        System.out.print("Informe quantos dolares quer comprar: $");
        double quantiaD = sc.nextDouble();

        CurrencyConverter.dolar = valorD;
        CurrencyConverter.quantia = quantiaD;

        System.out.println("O valor pago em reais será de: R$"+ CurrencyConverter.converter());

    }
}
