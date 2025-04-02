public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rohan");
        BankAccount account2 = new BankAccount("Rahul");

        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        if (account1 instanceof BankAccount) {
            System.out.println("Account Holder: " + account1.getAccountHolderName());
            System.out.println("Account Number: " + account1.getAccountNumber());
        }

        if (account2 instanceof BankAccount) {
            System.out.println("Account Holder: " + account2.getAccountHolderName());
            System.out.println("Account Number: " + account2.getAccountNumber());
        }
    }
}

class BankAccount {
    static String bankName = "State Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = ++totalAccounts;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
