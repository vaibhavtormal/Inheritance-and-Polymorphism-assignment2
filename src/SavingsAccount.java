public class SavingsAccount extends Account{
    private double interesttRate;


    public SavingsAccount(int accountNumber,String accountHolder, double interesttRate){
        super(accountNumber, accountHolder);
        this.interesttRate = interesttRate;

    }
    public void getAccountInfo(){
        super.getAccountinfo();
        System.out.println("Interest Rate "+ interesttRate+ "%");
    }
}
