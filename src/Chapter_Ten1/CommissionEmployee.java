package Chapter_Ten1;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, securityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
             throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public int setBirthMonth(Date birthDate) {
        birthDate.setMonth(5);
        setBirthDate(birthDate);
        return birthDate.getMonth();
    }

    public String toString(){
        return String.format("%sEarnings: %f", super.toString(),earnings());
   }
}
