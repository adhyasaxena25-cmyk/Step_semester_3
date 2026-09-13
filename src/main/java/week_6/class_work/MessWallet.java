package main.java.week_6.class_work;

public class MessWallet {
    private double balance;

    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Opening balance cannot be negative. Initialized to 0.0");
            this.balance = 0.0;
        } else {
            this.balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0");
            return;
        }
        this.balance += amount;
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500.0);
        wallet.topUp(200.0);
        System.out.println("Balance after top-up: " + wallet.getBalance());

        wallet.deduct(1000.0);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}
