package Entities;

public class Employee {
    public String name;
    public double grossSallary;
    public double tax;


    public double netSallary (double taxa){
       grossSallary = grossSallary - tax;
     return tax;
    }
    public void increaseSallary (double percentage){
        grossSallary += ((percentage/100)*(grossSallary+tax));
    }
    public String toString(){
        return ("Updated data: "+ name +", $"+ grossSallary);
    }
}
