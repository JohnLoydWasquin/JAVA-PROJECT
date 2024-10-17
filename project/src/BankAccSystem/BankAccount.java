package project.src.BankAccSystem;

class BankAccount {
    private String accountNumber, accountHolderName;
    private String balance;

    public BankAccount(String accountNumber, String accountHolderName, String balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getNumber(){
        return accountNumber;
    }

    public String getholderName(){
        return accountHolderName;
    }
    
    public void setBalance(String balance){
        this.balance = balance;
    }

    public String getBalance(){
        return balance;
    }
}
