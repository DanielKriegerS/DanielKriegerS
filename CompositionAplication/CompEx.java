package CompositionAplication;


import CompositionEntities.Client;
import CompositionEntities.Order;
import CompositionEntities.OrderItem;
import CompositionEntities.Product;
import CompositionEnums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;


import static CompositionEnums.OrderStatus.PENDING_PAYMENT;

public class CompEx {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the client data: ");
        System.out.print ("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.next());

        Client c1 = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, c1);

        System.out.println("");
        System.out.print("How many items to this order? ");
        int nOrder = sc.nextInt();

        for (int i = 0; i < nOrder; i++){
            System.out.println("Enter #"+ i+1 +" item data: ");
            System.out.print("Product name: ");
            sc.nextLine(); // por causa da quebra de linha do n inteiro
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double pPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int pQuant = sc.nextInt();

            Product p1 = new Product(pName,pPrice);

            OrderItem it = new OrderItem(pQuant, pPrice, p1);

            order.addItem(it);
        }
        System.out.println(order);





        sc.close();

    }
}
