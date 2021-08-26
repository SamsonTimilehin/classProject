package Chapter_Ten1;

public class BasePlusCommissionEmployee extends CommissionEmployee {

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
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

//    @Override
//    public void setBirthMonth(Date birthday){
//        setBirthDate(birthday);
//
//    }

    public String toString(){
        return String.format("%s ",super.toString());
    }
}
