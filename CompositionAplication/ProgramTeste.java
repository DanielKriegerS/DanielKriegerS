package CompositionAplication;

import CompositionEntities.Comment;
import CompositionEntities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramTeste {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow, thats awesome!");
        Post p1 = new Post(date.parse("21/06/2018 13:05:44"),
                "Traveling to New Zelland!",
                "I'm going to visit this wonderful country",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
