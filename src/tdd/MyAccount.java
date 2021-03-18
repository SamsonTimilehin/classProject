package tdd;

public class MyAccount {

    double balance;
    private int pin;

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;

    }

    public void setPin(int newPin) {
        pin = newPin;
    }

    public void withdraw(double amountToWithdraw, int pin) {
        if (pin == this.pin) {
            balance -= amountToWithdraw;
        }
    }


    public void setFixBalance(int fixBalance) {
    }
}


