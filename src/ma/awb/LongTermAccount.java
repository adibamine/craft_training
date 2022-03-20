package ma.awb;

public class LongTermAccount extends BankAccount {

    private double balance;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

}