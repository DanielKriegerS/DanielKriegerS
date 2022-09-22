package testeMain1;

import java.util.Locale;
import java.util.Scanner;
import testeRectangle.Rectangle;

public class Main {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle widht and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        rectangle.height = height;
        rectangle.width = width;

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();

        System.out.println(rectangle);
        System.out.println("");
    }
}
