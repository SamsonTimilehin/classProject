package Chapter_Ten_Exercise_15;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, securityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }

    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());

    }
}
