package Chapter_Ten_Exercise_15;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String securityNumber, double wage, double hours) {
        super(firstName, lastName, securityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public void setWage(double wage){
        this.wage = wage;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }

    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
}
