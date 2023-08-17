public class BankingSystem {
    public static void processAccounts(Account[] accounts){
        for(Account account : accounts){
            if(account instanceof SavingsAccount){
                account.deposit(500);
            }
            else if(account instanceof CheckinigAccount){
                ((CheckinigAccount) account).withdraw(100);
            }
            account.getAccountinfo();
        }
    }
}
