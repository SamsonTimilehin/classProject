package Chapter_Nine;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private final double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public double earning(){
        return baseSalary + super.earning();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%f%n%f%n%f%n",getFirstName(),getLastName(),getSocialSecurityNumber()
                ,getGrossSales(),getCommissionRate(), baseSalary);
    }
}
