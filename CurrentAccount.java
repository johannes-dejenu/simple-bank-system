public class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, String accountName, int balance){
        super(accountNumber, accountName, balance);
    }

    @Override
    public void deposit(int amount){
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(int amount){}


    
    @Override
    public void displayInfo(){

    }
    
}