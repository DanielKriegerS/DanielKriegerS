package Entities;

public class BussinessAccount extends Account{
    private Double loanLimit;

    public BussinessAccount() {
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public double loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
        return balance;
    }
    @Override
    public void withdraw (double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
