package CompositionAplication;

import CompositionEntities.Department;
import CompositionEntities.HourContract;
import CompositionEntities.Worker;
import CompositionEnums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
            
        System.out.print("Enter department name: ");
        String depName = sc.nextLine();
        System.out.println("Enter the worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        Double workerBS = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBS, new Department(depName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Enter contract number "+ i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("");
        System.out.println("Enter month and year to calcule income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); // recortando o ano completo para pegar apenas o mês e converter. Inicio posição 0, fim posição 2 (necessário o fim ser sempre 1 a mais)
        int year = Integer.parseInt(monthAndYear.substring(3)); // o mesmo de cima, mas recortando apartir da posição 3 até o fim.

        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear +": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
