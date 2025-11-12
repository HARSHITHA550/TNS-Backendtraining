package accessdemo;


public class BankMain {
    public static void main(String[] args) {
        // Create object
        BankAccount account = new BankAccount();

        // Accessing public, protected, and default members
        account.accountHolder = "Harshitha";
        account.accountType = "Savings";
        account.bankName = "State Bank of India";

        // Accessing private variable through setter
        account.setBalance(5000);

        // Display account details
        account.displayAccountInfo();

        // Access private variable via getter
        System.out.println("Balance (via getter): " + account.getBalance());
    }
}
