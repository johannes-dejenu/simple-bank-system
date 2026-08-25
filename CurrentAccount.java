public class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, String accountName, int balance){
        super(accountNumber, accountName, balance);
    }

    @Override
    public void deposit(int amount){
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(int amount){
        super.setBalance(super.getBalance() - amount);
    }
    @Override
    public void displayInfo(){
        System.out.println("Account name: " + super.getAccountName());
        System.out.println("Account number: " + super.getAccountNumber());
        System.out.println("Balance: " + super.getBalance());

    }
    
}