package main.java.week_7.practice_problems;

public class PiggyBank {
    private final String piggyBankId;
    private double savings;

    public PiggyBank(String piggyBankId) {
        this.piggyBankId = piggyBankId;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive");
            return;
        }
        this.savings += amount;
        System.out.println("Deposited Rs " + amount + " -> savings = " + this.savings);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive");
            return;
        }
        if (amount > this.savings) {
            System.out.println("Withdrawal rejected: insufficient savings, savings stays " + this.savings);
            return;
        }
        this.savings -= amount;
        System.out.println("Withdrew Rs " + amount + " -> savings = " + this.savings);
    }

    public double getSavings() {
        return this.savings;
    }

    public String getPiggyBankId() {
        return this.piggyBankId;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}