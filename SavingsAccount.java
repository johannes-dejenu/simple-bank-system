public class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, String accountName, int Balance){
        super(accountNumber, accountName, Balance);
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
        System.out.println("Account Number: " + super.getAccountNumber());
        System.out.println("Account Name: " + super.getAccountName());
        System.out.println("Balance: " + super.getBalance());
    }
    
}