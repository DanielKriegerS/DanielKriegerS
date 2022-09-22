package Utils;

public class CurrencyConverter {
    public static double dolar;
    public static double quantia;

    public static double converter(){
       dolar = dolar*quantia ;
       return dolar+=(dolar/100*6);
    }
}
