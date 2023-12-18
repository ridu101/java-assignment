import java.util.Scanner;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Please enter a valid amount to deposit.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount to withdraw.");
        }
    }
    public double checkBalance() {
        return balance;
    }

    private void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

        public static void main(String[] args) {
        // Creating objects of BankAccount class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Account name:");
        String  name;
        name=sc.nextLine();
        int number;
        System.out.println("Enter Account number:");
        number=sc.nextInt();
        int deposit,withdraw;
        System.out.println("Enter How Much Money You want to Withdraw:");
        withdraw=sc.nextInt();
        System.out.println("Enter How Much Money You want to Deposit:");
        deposit=sc.nextInt();



        BankAccount account1 = new
        BankAccount account2 = new 

        // Calling different methods for the objects
        account1.deposit(500.0);
        account2.withdraw(200.0);

        double balance1 = account1.checkBalance();
        double balance2 = account2.checkBalance();

        System.out.println("Account 1 Balance: " + balance1);
        System.out.println("Account 2 Balance: " + balance2);
    }
}
