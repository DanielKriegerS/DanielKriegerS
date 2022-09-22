package Entities;

public class ContaBanco {
    private int nConta;
    private String nome;
    private double saldo = 0;

    public int getnConta() {
        return nConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public ContaBanco(int nConta, String nome) {
        this.nConta = nConta;
        this.nome = nome;
    }

    public ContaBanco(int nConta, String nome, double saldoIni) {
        this.nConta = nConta;
        this.nome = nome;
        deposito(saldoIni);
    }

    public void deposito (double quantia){
        saldo += quantia;
    }

    public void saque (double quantia){
        saldo -= quantia + 5;
    }

    public String toString(){
        return "Numero Conta "+ nConta + ", titular: "+ nome + ", Saldo: $ " + String.format ("%.2f", saldo);
    }

}
