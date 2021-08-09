package Chapter_Nine;

public class CommissionEmployee extends Employee{

    private final double grossSales;
    private final double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber
            ,double grossSales,double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
             throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if(grossSales <= 0.0){
            throw new IllegalArgumentException("Gross Salary must be > 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public double earning(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%f%n%f%n",getFirstName(),getLastName(),getSocialSecurityNumber()
                ,grossSales, commissionRate);

    }
}
