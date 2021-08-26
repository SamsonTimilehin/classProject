package Chapter_Ten1;

import Chapter_Ten1.Date;
import Chapter_Ten1.Employee;

public class HourlyEmployee extends Employee {

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
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("%sEarnings: %f",super.toString(),earnings());
    }
}
