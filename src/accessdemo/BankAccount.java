package accessdemo;


public class BankAccount {

    // Access modifiers
    public String accountHolder;      
    private double balance;           
    protected String accountType;     
    String bankName;                  // default (no modifier)

    // Getter and Setter for private variable
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance!");
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Bank Name: " + bankName);
    }
}