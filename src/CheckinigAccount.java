public class CheckinigAccount extends Account
{
    private double overdraftLimit;

    public CheckinigAccount(int accountNumber, String accountHolder, double overdraftLimit){
        super(accountNumber,accountHolder);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance + overdraftLimit) {

            balance -=amount;
            System.out.println("withdrawn = "+ amount);

        }
    }
}
