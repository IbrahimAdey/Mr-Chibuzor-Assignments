package Test;

public class Account {
    private String firstName;
    private String lastName;
    private String pin;
    private double balance;
    private boolean isActive;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0.0;
        this.isActive = true;
    }

    public boolean checkPin(String pin) {
        return !this.pin.equals(pin);
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, String pin) {
        if (checkPin(pin)) return false;
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public boolean transfer(Account recipient, double amount, String pin) {
        if (checkPin(pin) || amount > balance) return false;
        balance -= amount;
        recipient.deposit(amount);
        return true;
    }

    public boolean changePin(String oldPin, String newPin) {
        if (checkPin(oldPin)) return false;
        this.pin = newPin;
        return true;
    }

    public boolean closeAccount(String pin) {
        if (checkPin(pin)) return false;
        this.isActive = false;
        return true;
    }

    public double getBalance(String pin) {
        if (checkPin(pin)) throw new SecurityException("Invalid PIN");
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }
}


