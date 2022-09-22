import java.time.LocalDate;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args){

        LocalDate d01 = LocalDate.now(); //data local
        LocalDateTime d02 = LocalDateTime.now(); //data+hora local
        Instant d03 = Instant.now(); //data+hora global

        LocalDate d04 = LocalDate.parse("2022-09-03"); //informando data local
        LocalDateTime d05 = LocalDateTime.parse("2022-09-03 - 20T01:30:26"); //informando data+hora local

        Instant d06 = Instant.parse("2022-09-03 - 20T01:30:26Z");//informando data+hora global
        Instant d07 = Instant.parse("2022-09-03 - 20T01:30:26-03:00");//informando data+hora no molde global, mas de determinado fuso-horario (-03-00)

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // identifica padrão informado para reformatar
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // informa data com formato fora do padrão
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); // passando a data para ser formatada já direto.

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20,1, 30);

        System.out.println("D 01 = "+ d01.toString());
        System.out.println("D 02 = "+ d02.toString());
        System.out.println("D 03 = "+ d03.toString());
        System.out.println("D 04 = "+ d04.toString());
        System.out.println("D 05 = "+ d05.toString());
        System.out.println("D 06 = "+ d06.toString());
        System.out.println("D 07 = "+ d07.toString());
        System.out.println("D 08 = "+ d08.toString());
        System.out.println("D 09 = "+ d09.toString());
        System.out.println("D 10 = "+ d10.toString());
        System.out.println("D 11 = "+ d11.toString());
    }
}
