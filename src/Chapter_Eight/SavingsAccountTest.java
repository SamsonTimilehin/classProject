package Chapter_Eight;

import java.math.BigDecimal;

public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount("Rose", BigDecimal.valueOf(2000), BigDecimal.valueOf(0.04));
        SavingsAccount saver2 = new SavingsAccount("John", BigDecimal.valueOf(3000), BigDecimal.valueOf(0.04));

        System.out.println("Balance without interest rate");
        System.out.printf("%s\t%f%n%s\t%f%n",saver1.getName(),saver1.getSavingsBalance(),saver2.getName(),saver2.getSavingsBalance());

        System.out.println("Balance with interest rate");

        saver1.calculateMonthlyInterestRate();
        System.out.println(saver1);

        saver2.calculateMonthlyInterestRate();
        System.out.println(saver2);

        SavingsAccount.modifyInterestRate(BigDecimal.valueOf(0.05));

        System.out.println("Balance after increasing interest rate");

        saver1.calculateMonthlyInterestRate();
        System.out.println(saver1);

        saver2.calculateMonthlyInterestRate();
        System.out.println(saver2);

    }
}
