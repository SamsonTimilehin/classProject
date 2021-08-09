package Chapter_Eight;

import java.math.BigDecimal;

public class SavingsAccount {

    private final String name;
    private BigDecimal savingsBalance;
    private static BigDecimal annualInterestRate;

    public SavingsAccount(String name, BigDecimal savingsBalance, BigDecimal annualInterestRate) {
        this.name = name;
        this.savingsBalance = savingsBalance;
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSavingsBalance() {
        return savingsBalance;
    }

    public static BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    public BigDecimal calculateMonthlyInterestRate(){

        BigDecimal monthlyInterest;
        monthlyInterest = savingsBalance.multiply(annualInterestRate).divideToIntegralValue(BigDecimal.valueOf(12));

        savingsBalance = savingsBalance.add(monthlyInterest);
        return monthlyInterest;
    }

    public static void modifyInterestRate(BigDecimal annualInterestRate){
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public String toString(){
       return String.format("%s\t%f", name,savingsBalance);
    }
}
