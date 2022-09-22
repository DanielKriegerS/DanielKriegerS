package listEntities;

public class exercList {
    private int id;
    private String nome;
    private double salario;

    public exercList(){

    }
    public exercList(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumento (double percentual){
       salario += salario*percentual/100;
    }

    @Override
    public String toString() {
        return id + ", "+ nome +", "+ String.format("%.2f", salario);
    }
}
