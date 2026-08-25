public abstract class BankAccount{
    private int accountNumber;
    private String accountName;
    private int balance;

    public BankAccount() {}

    public BankAccount(int accountNumber, String accountName, int balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(int amount);
    public abstract void deposit(int amount);
    public abstract void displayInfo();



    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public int getBalance(){
        return this.balance;
    }

    

}