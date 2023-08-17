public class Account {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(int accountNumber,String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited : "+ amount);

        }else {
            System.out.println("Invalid amount");
        }
    }
    public void getAccountinfo(){
        System.out.println("Account Number "+ accountNumber);
        System.out.println("Account holder "+ accountHolder);
        System.out.println("Balance :"+ balance);
    }


}
