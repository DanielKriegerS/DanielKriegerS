package listTeste;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import listEntities.exercList;

public class mainExList {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <exercList> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serao registrados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Funcionario " + (i + 1) + ":");
            System.out.print("ID ");
            int id = sc.nextInt();

            while (hasId(list, id)){
                System.out.println("ID já existente no sistema!");
                id = sc.nextInt();
            }

            System.out.print("Nome ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario ");
            Double salario = sc.nextDouble();


            list.add(new exercList(id, nome, salario));
        }
        System.out.print("Informe o ID do funcionario que recebera aumento: ");
        int idS = sc.nextInt();

        exercList func = list.stream().filter(x -> x.getId() == idS).findFirst().orElse(null);

        if (func == null){
            System.out.println("ID nao encontrado!");
        } else {
            System.out.print("Informe o percentual: ");
            double percentual = sc.nextDouble();
            func.aumento(percentual);
        }

        System.out.println("");
        System.out.println("Lista atualizada de funcionarios: ");

        for (exercList funcios : list) {
            System.out.println(funcios);
        }

        sc.close();
    }
    public static boolean hasId (List <exercList> list, int id){
        exercList func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
