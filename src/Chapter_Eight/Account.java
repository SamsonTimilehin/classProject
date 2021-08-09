package Chapter_Eight;

import java.math.BigDecimal;

public class Account {

    private final String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {

        this.name = name;

        this.balance = balance;

    }
    public String getName() {
        return name;
    }
    public void deposit(BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0.0)
            balance = balance.add(depositAmount);
    }
    public void withdraw(BigDecimal withdrawAmount) {
        if (withdrawAmount.compareTo(BigDecimal.ZERO) > 0.0) {
            balance = balance.subtract(withdrawAmount);
        }
        if(balance.compareTo(withdrawAmount) < 0.0){
            throw new IllegalArgumentException("Overdraft is not allowed");

        }
    }
    public BigDecimal getBalance() {
        return balance;
    }

}
