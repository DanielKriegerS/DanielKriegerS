package Entities;

public class Aluno {
    public String nome;
    public int nota1;
    public int nota2;
    public int nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public double resultFinal(){
        if (notaFinal()<60){
            return 60 - notaFinal();
        } else {
            return 0;
        }
    }


}
