public class SavingsAccount extends BankAccount{


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