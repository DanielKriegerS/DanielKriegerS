package Program;

import java.util.Scanner;
import java.util.Locale;
import Entities.Employee;


public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Sallary: $");
        employee.grossSallary = sc.nextDouble();
        System.out.print("Tax: $");
        double taxa = sc.nextDouble();
        employee.tax = taxa;
        employee.netSallary(taxa);

        System.out.println("");
        System.out.print (employee);
        System.out.println("");

        System.out.print("Which percentage to increase in salary? ");
        double percent = sc.nextDouble();

        employee.increaseSallary(percent);


        System.out.println("");

        System.out.print (employee);



        sc.close();
    }
}
