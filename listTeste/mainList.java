package listTeste;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class mainList {
    public static void main(String[] args){
        List <String>  list = new ArrayList <> ();

        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Anna"); // adiciona normalmente.
        list.add(2, "Marco"); // adiciona direto em x ID.


        for (String nomes : list){
            System.out.println(list);
        }
        System.out.println("------------------------------------------------");

        list.remove("Anna"); // remove por comparação entre o valor na lista e o valor indicado.
        list.remove(2); // remove direto pelo ID.
        list.removeIf(x -> x.charAt(0) =='M'); // Remove predicado.Retorna verdadeiro ou falso.
                                                // No caso, se x charAt na posição 0 for M, é executado.
        System.out.println(list.size());

        System.out.println("------------------------------------------------");

        System.out.println("Index do Bob: "+ list.indexOf("Bob")); // Busca o ID do valor buscado.
        System.out.println("Index do Bob: "+ list.indexOf("Marcelo")); // Quando não encontra o valor/elemento, devolve -1.

        System.out.println("------------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) =='A').collect(Collectors.toList());
        // filtra a lista, convertendo para Stream, após isso com collect devolve como String.
        for (String soComA : result){
            System.out.println(soComA);
        }

        System.out.println("------------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        // retorna o primeiro elemento da lista que tenha o predicado pedido no local certo. Caso não haja nenhum retorna nulo.
        System.out.println(name);
    }
}
