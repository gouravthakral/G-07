package DSA.Week_02_Basics;

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public abstract void applyInterest();
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void applyInterest() {
    }
}

public class OOPPrinciples {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA1001", 1000.0, 5.0);
        Account current = new CurrentAccount("CA2001", 2000.0);

        savings.deposit(500.0);
        savings.applyInterest();

        current.withdraw(300.0);

        Account[] accounts = { savings, current };
        for (Account acc : accounts) {
            System.out.println(acc.getAccountNumber() + " : " + acc.getBalance());
        }
    }
}
